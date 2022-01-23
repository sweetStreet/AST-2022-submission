from ui.Macros import Macros
from ui.labels.eval_utils import batch_rouge, batch_edit_sim
from typing import List
from seutil import IOUtils
from jsonargparse import CLI
from ui.labels.keyword_util import column_name_list, dump_xlsx, load_xlsx, lemmatization, remove_stop_words
import collections
import numpy as np
import math
import sys
from scipy.stats import t
from scipy import stats
import matplotlib.pyplot as plt


class MetricsCollector:
    def metrics_label_scores_projects(self, projects: List[str], algorithm: str = "pcfg", action_verb_only: bool = False):
        for project in projects:
            print(project)
            self.metrics_label_scores(project, algorithm, action_verb_only)

    def metrics_label_scores(self, project: str, algorithm: str, action_verb_only: bool = False):
        if algorithm == "pcfg":
            xlsx_path = f"{Macros.results_dir}/pcfg/{project}-pcfg-labels1.xlsx"
        else:
            xlsx_path = f"{Macros.results_dir}/{algorithm}/{project}-labels.xlsx"
        col_name_list = column_name_list(xlsx_path)
        index_manual_label = col_name_list.index("manual label")
        index_algorithm_label = col_name_list.index(f"{algorithm} label")
        index_action_verb = col_name_list.index("manual label action")
        manual_labels = []
        algorithm_labels = []
        smooth_rouge2_index = []
        for row in load_xlsx(xlsx_path):
            manual_label = row[index_manual_label]
            action_verb = row[index_action_verb]
            algorithm_label = row[index_algorithm_label]
            if manual_label is None or algorithm_label is None:
                print(project, "\t", manual_label, "\t", algorithm_label)
                algorithm_label = " "
            if action_verb_only and (action_verb is None or action_verb == "none"):
                continue
            else:
                manual_label = remove_stop_words(lemmatization(row[index_manual_label]))
                if len(manual_label.strip().split(" ")) == 1:
                    smooth_rouge2_index.append(len(manual_labels))
                algorithm_label = remove_stop_words(lemmatization(row[index_algorithm_label]))
                print(row[0])
            manual_labels.append(manual_label)
            algorithm_labels.append(algorithm_label)
        rouge_1_res, rouge_2_res, rouge_l_res = batch_rouge(manual_labels, algorithm_labels)

        edit_sim_res = batch_edit_sim(manual_labels, algorithm_labels)
        # print(project, "\t", len(scores), "\t", "{:.2f}".format(np.mean(scores)), "\t", "{:.2f}".format(np.std(scores)))
        print(smooth_rouge2_index)
        # save to xlsx file
        if not action_verb_only:
            xlsx_results = []
            col_name_list.extend(["p@1", "r@1", "f@1", "p@2", "r@2", "f@2", "p@l", "r@l", "f@l", "edit sim"])
            xlsx_results.append(col_name_list)
            for index, row in enumerate(load_xlsx(xlsx_path)):
                try:
                    if index in smooth_rouge2_index:
                        rouge_2_res[index] = rouge_1_res[index]
                    row.extend([rouge_1_res[index]["p"], rouge_1_res[index]["r"], rouge_1_res[index]["f"],
                                rouge_2_res[index]["p"], rouge_2_res[index]["r"], rouge_2_res[index]["f"],
                                rouge_l_res[index]["p"], rouge_l_res[index]["r"], rouge_l_res[index]["f"],
                                edit_sim_res[index]])
                except Exception as e:
                    print(project, rouge_1_res[index], row)
                    raise RuntimeError(e)
                xlsx_results.append(row)
            dump_xlsx(f"{Macros.results_dir}/{algorithm}/{project}-labels-eval.xlsx", xlsx_results)

        res_dict = {
            "project": project,
            "rouge-1": rouge_1_res,
            "rouge-2": rouge_2_res,
            "rouge-l": rouge_l_res,
            "edit_sim": edit_sim_res
        }
        if action_verb_only:
            IOUtils.dump(Macros.results_dir / "metrics" / f"{algorithm}-label-scores-{project}-action-verb-only.json", res_dict,
                         IOUtils.Format.jsonPretty)
        else:
            IOUtils.dump(Macros.results_dir / "metrics" / f"{algorithm}-label-scores-{project}.json", res_dict,
                     IOUtils.Format.jsonPretty)

    # python -m ui.labels.eval action_verb_statistics --projects "['addressbook', 'claroline', 'collabtive',
    # 'jpetstore', 'mantisbt', 'mrbs', 'phoenix', 'ppma']"
    def action_verb_statistics(self, projects: List[str]):
        action_counter = collections.Counter()
        for project in projects:
            xlsx_path = f"{Macros.results_dir}/paths/{project}-labels.xlsx"
            col_name_list = column_name_list(xlsx_path)
            manual_label_action_index = col_name_list.index("manual label action")
            manual_label_index = col_name_list.index("manual label")
            for row in load_xlsx(xlsx_path):
                if row[manual_label_index].strip() == "none":
                    continue
                manual_label_action = row[manual_label_action_index]
                action_counter[manual_label_action] += 1
            print(project, sum(action_counter.values()))
        action_counter = dict(sorted(action_counter.items(), key=lambda item: item[1], reverse=True))
        IOUtils.dump(Macros.results_dir / "metrics" / f"action_verb_counter.json", action_counter,
                     IOUtils.Format.jsonNoSort)

    # python -m ui.labels.eval percent_clickable_contains_action_verb --projects "['addressbook', 'claroline', 'collabtive',
    # 'jpetstore', 'mantisbt', 'mrbs', 'phoenix', 'ppma']" --algorithms "['preprocess', 'keybert', 'heuristic', 'pcfg']"
    def percent_clickable_contains_action_verb(self, projects: List[str], algorithms: List[str]):

        for algorithm in algorithms:
            algorithm_total = 0
            algorithm_contain_action_verb = 0
            for project in projects:
                if algorithm == "pcfg":
                    xlsx_path = f"{Macros.results_dir}/pcfg/{project}-pcfg-labels1.xlsx"
                else:
                    xlsx_path = f"{Macros.results_dir}/{algorithm}/{project}-labels.xlsx"
                col_name_list = column_name_list(xlsx_path)
                index_manual_label = col_name_list.index("manual label")
                index_algorithm_label = col_name_list.index(f"{algorithm} label")
                index_action_verb = col_name_list.index("manual label action")
                total_element = 0
                contain_action_verb = 0
                for row in load_xlsx(xlsx_path):
                    if row[index_manual_label].strip() == "none":
                        continue
                    if row[index_action_verb].strip() == "none":
                        continue

                    total_element += 1
                    algorithm_total += 1
                    if row[index_action_verb].strip() in row[index_algorithm_label]:
                        contain_action_verb += 1
                        algorithm_contain_action_verb += 1

                print(algorithm, "\t", project, "\t", contain_action_verb, "\t", total_element, "\t", round(contain_action_verb/total_element, 2))
            print(algorithm, algorithm_contain_action_verb, algorithm_total)

    def get_element_id_to_scores(self, project: str, method: str):
        pcfg_eval_path = Macros.results_dir / method / f"{project}-labels-eval.xlsx"
        pcfg_columns_list = column_name_list(pcfg_eval_path)
        id_index = pcfg_columns_list.index("id")
        manual_label_index = pcfg_columns_list.index("manual label")
        pcfg_label_index = pcfg_columns_list.index(f"{method} label")
        p1_index = pcfg_columns_list.index("p@1")
        r1_index = pcfg_columns_list.index("r@1")
        f1_index = pcfg_columns_list.index("f@1")
        element_id_to_scores = dict()
        element_id_to_manual_labels = dict()
        element_id_to_pcfg_labels = dict()
        for row in load_xlsx(pcfg_eval_path):
            element_id_to_scores[row[id_index]] = [row[p1_index], row[r1_index], row[f1_index]]
            element_id_to_manual_labels[row[id_index]] = row[manual_label_index]
            element_id_to_pcfg_labels[row[id_index]] = row[pcfg_label_index]
        return element_id_to_scores, element_id_to_pcfg_labels, element_id_to_manual_labels

    def rank_method(self, projects: List[str]):
        method_to_pcfg_f1 = dict()
        method_to_h_f1 = dict()
        method_to_manual_labels = dict()
        method_to_pcfg_labels = dict()
        method_to_h_labels = dict()

        for project in projects:
            print(project)
            pcfg_element_id_to_scores, pcfg_element_id_to_pcfg_labels, pcfg_element_id_to_manual_labels = \
                self.get_element_id_to_scores(project, "pcfg")
            h_element_id_to_scores, h_element_id_to_h_labels, h_element_id_to_manual_labels = \
                self.get_element_id_to_scores(project, "heuristic")
            java_file_path = Macros.results_dir / "frag-gen-updated" / project / "src" / "test" / "java" / "generated" / "GeneratedTests.java"
            with open(java_file_path, errors='ignore') as java_file:
                for line in java_file:
                    if line.strip().startswith("public void") and "path" in line:
                        method_name = line.split("path")[1].strip().replace("(){", "")
                        clickables_list = method_name.split("_")
                        if len(clickables_list) <= 2:
                            continue
                        pcfg_f1 = list()
                        h_f1 = list()
                        pcfg_labels = list()
                        h_labels = list()
                        manual_labels = list()
                        for clickable in clickables_list:
                            if not clickable:
                                continue
                            if clickable not in pcfg_element_id_to_pcfg_labels.keys():
                                continue
                            pcfg_f1.append(pcfg_element_id_to_scores[clickable])
                            h_f1.append(h_element_id_to_scores[clickable])
                            pcfg_labels.append(pcfg_element_id_to_pcfg_labels[clickable])
                            h_labels.append(h_element_id_to_h_labels[clickable])
                            manual_labels.append(pcfg_element_id_to_manual_labels[clickable])
                        method_to_pcfg_f1[project + method_name] = np.mean(pcfg_f1)
                        method_to_h_f1[project + method_name] = np.mean(h_f1)
                        method_to_manual_labels[project + method_name] = ", ".join(manual_labels)
                        method_to_pcfg_labels[project + method_name] = ", ".join(pcfg_labels)
                        method_to_h_labels[project + method_name] = ", ".join(h_labels)
        ranked_method_to_pcfg_f1 = dict(sorted(method_to_pcfg_f1.items(), key=lambda item: item[1], reverse=True))
        ranked_method_to_h_f1 = dict(sorted(method_to_h_f1.items(), key=lambda item: item[1], reverse=True))
        for method, f1 in ranked_method_to_h_f1.items():
            print(method, f"{f1=}", f"{method_to_pcfg_f1[method]}", f"{method_to_h_labels[method]=}", f"{method_to_pcfg_labels[method]=}",
                  f"{method_to_manual_labels[method]=}", "\n")

    def read_scores(self, project: str, algorithm: str, metric: str):
        proj_algo_metric_list = []
        project_res = IOUtils.load(
            Macros.results_dir / "metrics" / f"{algorithm}-label-scores-{project}.json")
        if metric.startswith("rouge"):
            for v in project_res[metric[:-2]]:
                if metric.endswith("p"):
                    proj_algo_metric_list.append(round(v["p"], 2))
                elif metric.endswith("r"):
                    proj_algo_metric_list.append(round(v["r"], 2))
                elif metric.endswith("f"):
                    proj_algo_metric_list.append(round(v["f"], 2))
        else:
            for v in project_res[metric]:
                proj_algo_metric_list.append(round(v, 2))
        return proj_algo_metric_list

    # python -m ui.labels.eval t_test_algorithms --projects "['addressbook', 'claroline', 'collabtive','jpetstore', 'mantisbt', 'mrbs', 'phoenix', 'ppma']"
    # --algorithms "['preprocess', 'keybert', 'heuristic', 'pcfg']" --metrics "['rouge-1-p', 'rouge-1-r', 'rouge-1-f', 'rouge-1-p', 'rouge-1-r', 'rouge-2-f', 'rouge-l-p',
    # 'rouge-l-r', 'rouge-l-f', 'edit_sim']"
    def t_test_algorithms(self, projects: List[str], algorithms: List[str], metrics: List[str]):
        for index1, algorithm1 in enumerate(algorithms):
            for index2 in range((index1 + 1),  len(algorithms)):
                algorithm2 = algorithms[index2]
                print(algorithm1, algorithm2)
                self.t_test(projects, algorithm1, algorithm2, metrics)
                print()

    # python -m ui.labels.eval t_test --projects "['addressbook', 'claroline', 'collabtive','jpetstore', 'mantisbt', 'mrbs', 'phoenix', 'ppma']"
    # --algorithm1 "pcfg" --algorithm2 "heuristic" --metrics "['rouge-1-p', 'rouge-1-r', 'rouge-1-f', 'rouge-1-p', 'rouge-1-r', 'rouge-2-f', 'rouge-l-p',
    # 'rouge-l-r', 'rouge-l-f', 'edit_sim']"
    def t_test(self, projects: List[str], algorithm1: str, algorithm2: str, metrics: List[str]):
        ##############
        # Parameters #
        ##############

        sample1 = []
        sample2 = []
        sample_len = len(sample1)
        for metric in metrics:
            for project in projects:
                sample1.extend(self.read_scores(project, algorithm1, metric))
                sample2.extend(self.read_scores(project, algorithm2, metric))

        t_value, p_value = stats.ttest_rel(sample1, sample2)

        one_tailed_p_value = float("{:.6f}".format(p_value/2))

        print('Test statistic is %f' % float("{:.6f}".format(t_value)))

        print('p-value for one_tailed_test is %f' % one_tailed_p_value)

        alpha = 0.05

        if one_tailed_p_value <= alpha:

            print('Conclusion','n','Since p-value(=%f)' % one_tailed_p_value,'<','alpha(=%.2f)' % alpha,'''We reject the null hypothesis H0. 
        So we conclude that the students have benefited by the tuition class. i.e., d = 0 at %.2f level of significance.'''%alpha)

        else:
            print('Conclusion','n','Since p-value(=%f)'%one_tailed_p_value,'>','alpha(=%.2f)'%alpha,'''We do not reject the null hypothesis H0.''')

if __name__ == "__main__":
    CLI(MetricsCollector, as_positional=False)