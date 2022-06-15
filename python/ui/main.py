from seutil import CliUtils, IOUtils, BashUtils, LoggingUtils
import os
from ui.Environment import Environment
from ui.Macros import Macros
from ui.labels.keyword_fraggen import KeywordGen, data_count_attributes_per_project
import sys
import random
import time

'''
Entry points of running code
'''
logging_file = Macros.python_dir / "experiment.log"
LoggingUtils.setup(filename=str(logging_file))
logger = LoggingUtils.get_logger(__name__)

def normalize_options(opts: dict) -> dict:
    if "log_path" in opts:
        logger.info(f"Switching to log file {opts['log_path']}")
        LoggingUtils.setup(filename=opts['log_path'])

    if "debug" in opts and str(opts["debug"]).lower() != "false":
        Environment.is_debug = True
        logger.debug("Debug mode on")
        logger.debug(f"Command line option: {opts}")

    if "parallel" in opts and str(opts["parallel"]).lower() != "false":
        Environment.is_parallel = True
        logger.warning("Parallel mode on")

    if "random_seed" in opts:
        Environment.random_seed = int(opts["random_seed"])
    else:
        Environment.random_seed = time.time_ns()

    random.seed(Environment.random_seed)
    logger.info(f"Random seed is {Environment.random_seed}")

    return opts

# python -m ui.main rank_attributes --projects="addressbook,jpetstore"
def rank_attributes(**options):
    """
    Rank attributes for all projects
    """
    project_names = options.get("projects")
    if not project_names:
        print("please provide project names")
    project_lists = [p.strip() for p in project_names.split(",")]
    for project in project_lists:
        KeywordGen(project).check_label_source()
    sorted_keys = data_count_attributes_per_project(project_lists)
    IOUtils.dump(Macros.results_dir / "ranked_attributes.json", sorted_keys)

# python -m ui.main labeled_tests_supervised --project="addressbook" --crawlfolder="/Users/xyz/AST-2022-submission/results/frag-gen-updated/addressbook"
def labeled_tests_supervised(**options):
    os.environ["TOKENIZERS_PARALLELISM"] = "false"
    project_name = options.get("project")
    crawl_folder_path = options.get("crawlfolder")
    if not project_name:
        print("please provide project name")
    if not crawl_folder_path:
        print("please provide absolute path of crawl folder generated by Crawljax")
    keywordGen = KeywordGen(project_name)
    keywordGen.label_paths_xlsx_format(crawl_folder_path)
    keywordGen.label_with_preprocess("heuristic")

if __name__ == "__main__":
    CliUtils.main(sys.argv[1:], globals(), normalize_options)