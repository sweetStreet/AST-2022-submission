from ui.labels.keyword_util import preprocess_dom
from ui.Macros import Macros
import copy
from typing import Dict, List, Optional, Sequence, Type, TypeVar, Union, Tuple
import nltk
from fuzzywuzzy import fuzz
from rouge import Rouge
from seutil import LoggingUtils
from tqdm import tqdm

logger = LoggingUtils.get_logger(__name__, LoggingUtils.DEBUG)


def get_each_generated_label_score(manual_label, generated_label):
    """
    The score of generate label is within the range of [0, 1]
    #(words in generated label  join  words in manual label) / # words in manual labels
    """
    # manual_labels = row[11].value, generated_labels = row[7].value + row[8].value + row[9].value
    total_score = 0
    actual_score = 0
    preprocessed_manual_label = preprocess_dom(manual_label)
    preprocessed_generated_label = preprocess_dom(generated_label)
    for manual_label_word in preprocessed_manual_label.split(" "):
        total_score += 1
        if manual_label_word in preprocessed_generated_label.split(" "):
            actual_score += 1
    # print(manual_label, generated_label, actual_score, total_score, actual_score / total_score)
    return actual_score / total_score


def get_manual_label_score(project_name, row):
    """
    We use extractive keyword extraction method, so when there is no such keyword in the source dom, it is impossible
    for our method to generate it.
    """
    current_dom = row[2].value
    preprocessed_current_dom = preprocess_dom(current_dom)
    context_dom = row[3].value
    preprocessed_context_dom = preprocess_dom(context_dom)
    state_diff_github_path = row[6].value
    state_diff_local_path = f"{Macros.results_dir}/states/{project_name}/" + state_diff_github_path.split("/")[-1]
    state_diff = open(state_diff_local_path, "r").read()
    state_diff = preprocess_dom(state_diff)
    manual_labels = row[11].value
    manual_label_list = manual_labels.split(",")
    result_score = 0
    for manual_label in manual_label_list:
        each_manual_label_score, appear_matrix = get_each_manual_label_score(preprocess_dom(manual_label.strip()),
                                                                                  preprocessed_current_dom,
                                                                                  preprocessed_context_dom, state_diff)
        result_score = max(result_score, each_manual_label_score)
    return result_score


def get_each_manual_label_score(manual_label: str, preprocessed_current_dom: str,
                                preprocessed_context_dom: str, state_diff: str):
    manual_label_list = [word for word in manual_label.split(" ") if word]
    manual_label_len = len(manual_label_list)
    if manual_label_len == 0:
        return 0, []

    total_score = 0
    appear_matrix = [[0 for _ in range(len(manual_label_list))] for _ in range(3)]
    for index, manual_label_word in enumerate(manual_label_list):
        appear = False
        if manual_label_word in preprocessed_current_dom:
            appear_matrix[0][index] = 1
            appear = True
        if manual_label_word in preprocessed_context_dom:
            appear_matrix[1][index] = 1
            appear = True
        if manual_label_word in state_diff:
            appear_matrix[2][index] = 1
            appear = True
        if appear:
            total_score += 1
    return total_score / len(manual_label_list), appear_matrix


def bleu(gold: List[str], pred: List[str]) -> float:
    """
    Calculate BLEU score, using smoothing method 2 with auto reweighting, in the range of 0~100.

    :param gold: list of gold tokens
    :param pred: list of predicted tokens
    :return: BLEU score
    """
    if len(pred) == 0 or len(gold) == 0:
        return 0.0
    return 100.0 * nltk.translate.bleu_score.sentence_bleu(
        [gold],
        pred,
        smoothing_function=nltk.translate.bleu_score.SmoothingFunction().method2,
        auto_reweigh=True,
    )


def batch_bleu(golds: List[List[str]], preds: List[List[str]]) -> List[float]:
    """
    Calculate BLEU score for a batch of sentences.

    :param golds: list of gold sentences
    :param preds: list of predicted sentences
    :return: list of BLEU scores
    """
    if len(golds) != len(preds):
        raise ValueError("golds and preds must have the same length")
    return [bleu(gold, pred) for gold, pred in zip(golds, preds)]


def corpus_bleu(golds: List[List[str]], preds: List[List[str]]) -> float:
    """
    Calculate corpus-level BLEU score for a batch of sentences.

    :param golds: list of gold sentences
    :param preds: list of predicted sentences
    :return: corpus-level BLEU score
    """
    if len(golds) != len(preds):
        raise ValueError("golds and preds must have the same length")
    return 100.0 * nltk.translate.bleu_score.corpus_bleu(
        [[gold] for gold in golds],
        preds,
        smoothing_function=nltk.translate.bleu_score.SmoothingFunction().method2,
        auto_reweigh=True,
    )


def edit_sim(
    gold: Union[str, List[str]], pred: Union[str, List[str]], sep: str = " "
) -> float:
    """
    Calculate char-level edit similarity, in the range of 0~100.

    :param gold: gold sentence or list of gold tokens
    :param pred: predicted sentence or list of predicted tokens
    :param sep: separator between tokens
    :return: char-level edit similarity
    """
    if len(pred) == 0 or len(gold) == 0:
        return 0.0
    if isinstance(gold, list):
        gold = sep.join(gold)
    if isinstance(pred, list):
        pred = sep.join(pred)
    return fuzz.ratio(gold, pred)


def batch_edit_sim(
    golds: List[Union[str, List[str]]],
    preds: List[Union[str, List[str]]],
    sep: str = " ",
) -> List[float]:
    """
    Calculate char-level edit similarity for a batch of sentences.

    :param golds: list of gold sentences
    :param preds: list of predicted sentences
    :param sep: separator between tokens
    :return: list of char-level edit similarity
    """
    if len(golds) != len(preds):
        raise ValueError("golds and preds must have the same length")
    return [edit_sim(gold, pred, sep) for gold, pred in zip(golds, preds)]


T = TypeVar("T")


def exact_match(gold: T, pred: T) -> float:
    """
    Calculate exact match accuracy, in the range of {0, 100}.

    :param gold: gold sentence or list of gold tokens
    :param pred: predicted sentence or list of predicted tokens
    :return: exact match accuracy
    """
    if len(pred) == 0 or len(gold) == 0:
        return 0.0
    return 100.0 if gold == pred else 0.0


def batch_exact_match(golds: List[T], preds: List[T]) -> List[float]:
    """
    Calculate exact match accuracy for a batch of sentences.

    :param golds: list of gold sentences
    :param preds: list of predicted sentences
    :return: list of exact match accuracy
    """
    if len(golds) != len(preds):
        raise ValueError("golds and preds must have the same length")
    return [exact_match(gold, pred) for gold, pred in zip(golds, preds)]


def rouge_l(
    gold: Union[str, List[str]], pred: Union[str, List[str]], sep: str = " "
) -> Dict[str, float]:
    """
    Calculate ROUGE-L F1, precision, and recall scores, in the range of 0~100.

    :param gold: gold sentence or list of gold tokens
    :param pred: predicted sentence or list of predicted tokens
    :return: {"p": precision, "r": recall, "f": F1}
    """
    if len(pred) == 0 or len(gold) == 0:
        return {"p": 0.0, "r": 0.0, "f": 0.0}
    if isinstance(gold, list):
        gold = sep.join(gold)
    if isinstance(pred, list):
        pred = sep.join(pred)
    rouge = Rouge()
    scores = rouge.get_scores(hyps=pred, refs=gold, avg=True)
    return {x: scores["rouge-l"][x] * 100.0 for x in ["p", "r", "f"]}


def batch_rouge_l(
    golds: List[Union[str, List[str]]],
    preds: List[Union[str, List[str]]],
    sep: str = " ",
) -> List[Dict[str, float]]:
    """
    Calculate ROUGE-L F1, precision, and recall scores for a batch of sentences.

    :param golds: list of gold sentences
    :param preds: list of predicted sentences
    :param sep: separator between tokens
    :return: list of {"p": precision, "r": recall, "f": F1}
    """
    if len(golds) != len(preds):
        raise ValueError("golds and preds must have the same length")
    return [rouge_l(gold, pred, sep) for gold, pred in zip(golds, preds)]


def rouge(
    gold: Union[str, List[str]], pred: Union[str, List[str]], sep: str = " "
) -> Tuple[dict, dict, dict]:
    """
    Calculate ROUGE-1, ROUGE-2, ROUGE-L F1, precision, and recall scores, in the range of 0~100.

    :param gold: gold sentence or list of gold tokens
    :param pred: predicted sentence or list of predicted tokens
    :return: {"p": precision, "r": recall, "f": F1}
    """
    if len(pred) == 0 or len(gold) == 0:
        return {"p": 0.0, "r": 0.0, "f": 0.0}, {"p": 0.0, "r": 0.0, "f": 0.0}, {"p": 0.0, "r": 0.0, "f": 0.0}
    if isinstance(gold, list):
        gold = sep.join(gold)
    if isinstance(pred, list):
        pred = sep.join(pred)
    rouge = Rouge()
    scores = rouge.get_scores(hyps=pred, refs=gold, avg=True)
    return {x: scores["rouge-1"][x] * 100.0 for x in ["p", "r", "f"]}, {x: scores["rouge-2"][x] * 100.0 for x in ["p", "r", "f"]}, {x: scores["rouge-l"][x] * 100.0 for x in ["p", "r", "f"]}


def batch_rouge(
    golds: List[Union[str, List[str]]],
    preds: List[Union[str, List[str]]],
    sep: str = " ",
) -> Tuple[List[dict], list, list]:
    """
    Calculate ROUGE-L F1, precision, and recall scores for a batch of sentences.

    :param golds: list of gold sentences
    :param preds: list of predicted sentences
    :param sep: separator between tokens
    :return: list of {"p": precision, "r": recall, "f": F1}
    """
    if len(golds) != len(preds):
        raise ValueError("golds and preds must have the same length")
    rouge_1_list = []
    rouge_2_list = []
    rouge_l_list = []
    for gold, pred in zip(golds, preds):
        rouge_1, rouge_2, rouge_l = rouge(gold, pred, sep)
        rouge_1_list.append(rouge_1)
        rouge_2_list.append(rouge_2)
        rouge_l_list.append(rouge_l)
    return rouge_1_list, rouge_2_list, rouge_l_list

def accuracy(
    gold: List[str],
    pred: List[str],
    ignore: Optional[Sequence[str]] = None,
) -> float:
    """
    Calculate token-level accuracy, in the range of 0~100.
    If gold and pred are not the same length, the longer one would be truncated.

    :param gold: list of gold tokens
    :param pred: list of predicted tokens
    :param ignore: list of (gold) tokens to ignore
    :return: accuracy
    """
    if len(pred) == 0 or len(gold) == 0:
        return 0.0
    i = 0
    total = 0
    match = 0
    while i < len(gold) and i < len(pred):
        if gold[i] in ignore:
            i += 1
            continue
        total += 1
        if gold[i] == pred[i]:
            match += 1
        i += 1

    if total == 0:
        return 0.0
    return 100.0 * match / total


def batch_accuracy(
    golds: List[List[str]],
    preds: List[List[str]],
    ignore: Optional[Sequence[str]] = None,
) -> List[float]:
    """
    Calculate token-level accuracy for a batch of sentences.

    :param golds: list of gold sentences
    :param preds: list of predicted sentences
    :param ignore: list of (gold) tokens to ignore
    :return: list of accuracy
    """
    if len(golds) != len(preds):
        raise ValueError("golds and preds must have the same length")
    return [accuracy(gold, pred, ignore) for gold, pred in zip(golds, preds)]


def first_match_to_topk(
    first_match_list: List[int], k_values: List[int]
) -> Dict[int, List[float]]:
    """
    Calculate top-k accuracy with the first match ranks (1-indexed).

    :param first_match: first match ranks (1-indexed)
    :param k_values: k values to consider
    :return: a mapping from k to top-k accuracies (ranging from 0~100)
    """
    return {k: [100.0 if x <= k else 0.0 for x in first_match_list] for k in k_values}
