import collections
import javalang
from seutil import IOUtils
from ui.Macros import Macros
import json
from ui.labels.keyword_util import preprocess_dom, get_element_label

'''
Code for parsing results from Crawljax
'''

def label_methods(project_name : str, save_file="True"):
    '''
    label the methods for projects crawled by Crawljax
    '''
    filename = str(project_name)+"-labels.json"
    label_path = Macros.results_dir / "labels" / filename
    label_result = []
    java_source_file_path = Macros.out_dir / project_name / "src" / "test" / "java" / "generated" / "GeneratedTests.java"
    tree = javalang.parse.parse(IOUtils.load(java_source_file_path, "txt"))

    appeared_element = set()
    for class_name in tree.types:
        if isinstance(class_name, javalang.tree.ClassDeclaration):
            for method in class_name.methods:
                try:
                    if not method.name.startswith("method") or method.name == "method_0":
                        continue
                    # if method.name == "method_26_27":
                    #     break
                    label_item = label_each_test_method(project_name, method.name)
                    # print("label_item", label_item)
                    if label_item:
                        for element_id, content in label_item.items():
                            if type(content) != dict:
                                continue
                            if element_id in appeared_element:
                                content["appeared"] = True
                            else:
                                content["appeared"] = False
                                appeared_element.add(element_id)
                        label_result.append(label_item)
                    else:
                        print("label test method returns none", method.name)
                except Exception as e:
                    print(e)
                    continue
    if save_file == "True":
        IOUtils.dump(label_path, label_result)


def label_each_test_method(project_name : str, method_name : str):
    label_item = {}
    print(method_name)
    try:
        edge_path = Macros.out_dir / project_name / "result.json"
        states_path = Macros.out_dir / project_name / "src" / "test" / "java" / "generated" / "states.json"
        eventables_path = Macros.out_dir / project_name / "src" / "test" / "java" / "generated" / "eventables.json"

        # a list of dict, each dict
        #   {
        #     "from" : "index",
        #     "to" : "state2",
        #     "text" : "Enter the Store",
        #     "id" : "xpath //DIV[@id = 'Content']/P[1]/A[1]",
        #     "element" : "Element{node=[A: null], tag=A, text=Enter the Store, attributes={href=actions/Catalog.action}}",
        #     "eventType" : "click"
        #   }
        edge_content = IOUtils.load(edge_path)["edges"]
        graph = collections.defaultdict(list)
        for edge in edge_content:
            graph[edge["from"]].append(edge)
        # print(graph.keys())
        # key value pair, key is index of state, in the format of str
        states_content = IOUtils.load(states_path)
        # key value pair, key is index of event, in the format of str
        eventables_content = IOUtils.load(eventables_path)

        # ['1', '25', '56', '66']
        if "path_" in method_name:
            eventable_elements = method_name[method_name.index("path_")+5:].split("_")
        else:
            eventable_elements = method_name.replace("method_", "").split("_")
        # print(eventable_elements)
        current_state = "index"

        eventable_elements_list = []
        for eventable_element in eventable_elements:
            # skip because eventable element with index "0" does not exist in eventables.json
            if eventable_element == "0":
                continue
            tokenized_element = preprocess_dom(json.dumps(eventables_content[eventable_element]["element"]))
            tokenized_element_list = list(filter(None, tokenized_element.split(" ")))
            eventable_elements_list.append(tokenized_element_list)

        states_dom_list = []
        for eventable_element in eventable_elements:
            print("element id", eventable_element)
            if eventable_element == "0":
                continue
            eventable_element_xpath = eventables_content[eventable_element]["identification"]["how"] + " " + \
                                      eventables_content[eventable_element]["identification"]["value"]
            eventable_element_details = eventables_content[eventable_element]["element"]
            # example:
            # {'tag': 'A', 'text': 'Enter the Store', 'attributes': {'href': 'actions/Catalog.action'}}
            # print(eventable_element_details)

            element_label = get_element_label(eventable_element_details)
            # print("element label:", element_label)
            label_item[eventable_element] = {}
            label_item[eventable_element]["label"] = element_label
            label_item[eventable_element]["manual label"] = ""
            label_item[eventable_element]["score"] = 0
            label_item[eventable_element]["details"] = eventable_element_details
            label_item[eventable_element]["label from edge"] = True
            label_item[eventable_element]["better label"] = ""
            tokenized_element = preprocess_dom(json.dumps(eventable_element_details))
            tokenized_element_list = list(filter(None, tokenized_element.split(" ")))
            label_item[eventable_element]["term frequency"] = str(dict(collections.Counter(tokenized_element_list)))
            # print("term frequency", label_item[eventable_element]["term frequency"])
            next_state = ""
            for edge in graph[current_state]:
                if edge["id"] == eventable_element_xpath:
                    next_state = edge["to"]
                    break

            if current_state == "index":
                current_state_index = "0"
            elif current_state.startswith("state"):
                current_state_index = current_state.replace("state", "")
            current_state = next_state

        label_item["method_name"] = method_name

    except Exception as e:
        print(e)
    return label_item


def label_states(project_name : str, save_file = "True"):
    filename = str(project_name) + "-state-labels.json"
    label_path = Macros.results_dir / filename
    label_result = []
    states_file_path = Macros.out_dir / project_name / "src" / "test" / "java" / "generated" / "states.json"
    states_content = IOUtils.load(states_file_path)
    for state_index, state_content in states_content.items():
        label_item = {}
        label_item["index"] = state_index
        label_item["path"] = f"{Macros.out_dir}/{project_name}/doms/frag_" + str(state_content["name"]) + ".html"
        label_item["dom"] = ""
        label_result.append(label_item)
    if save_file == "True":
        IOUtils.dump(label_path, label_result)