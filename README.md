# AST-2022-submission

## Overview of folders
### Folder `application`
It stores the source code of 13 applications that we use in the experiment.
They are from [FSE19-submission-material-DIG](https://github.com/matteobiagiola/FSE19-submission-material-DIG) and [FSE19-submission-material-TEDD](https://github.com/matteobiagiola/FSE19-submission-material-TEDD).

### Folder `crawl-results`
It stores the files that crawled from 13 applications by Crawljax.

### Folder `manual-labels`
It stores the files that contain labels manually assigned by us.
Each file contains: 
* `id`: unique id assigned by Crawljax	
* `details`: dictionary format of the clickable
* `current dom`: dom format of the clickable
* `context dom`: dom forst of the context of the clickable
* `source state url`: the url that stores the screenshot of source state
* `target state url`: the url that stores the screenshot of target state
* `state diff url`: the text difference between two states
* `manual label`: the label that represent the meaning of the clickable
* `manual label action`: the action verb in manual label	
* `manual label context`: to which degree we can extract meaningful information from the dom of clickable and its source and target state. It contains 3 different scores, 0 represents that the manual label is irrelevant to the clickable and states
1 represents that a part of manual label exists in the clickable and states
2 represents that the manual label exists completely in the clickable and states

### Folder `supervised-labels`
It stores the model output of Supervised approach and its evaluation results.
* `heuristic label` in `${project_name}-labels.xlsx` means the model output
* `${project_name}-labels-eval.xlsx` contains the scores of evaluation metrics for each clickable

### Folder `unsupervised-labels`
It stores the model output of Unsupervised approach and its evaluation results. 
* `pcfg label` in `${project_name}-pcfg-labels.xlsx` means the model output
* `${project_name}-labels-eval.xlsx` contains the scores of evaluation metrics for each clickable
* `${project_name}-pcfg-labels_no_context.xlsx` contains the model output after removing the usage of clickable context from input (use clickable only)
* `${project_name}-pcfg-postag.xlsx` contains production rules and the probability of each production rule

### Folder `keybert-labels` 
It stores the model output of KeyBERT (one of baselines) and its evaluation result.
* `keybert label` in `${project_name}-labels.xlsx` means the model output.
* `${project_name}-labels-eval.xlsx` contains the scores of evaluation metrics for each clickable

### Folder `preprocess-labels` 
It stores the model output of PreProcess (one of baselines) and its evaluation result.
* `preprocess label` in `${project_name}-labels.xlsx` means the model output
* `${project_name}-labels-eval.xlsx` contains the scores of evaluation metrics for each clickable

## CrawLabel
Folder `labelled-testcasegenerator-plugin` contains the source code of our tool `CrawLabel` to assign labels to test cases generated by Crawljax.


## Steps of generating labels
1. Go to folder python, run `pip install -r requirements.txt` (install necessary python libraries)
2. (1) If using supervised approach, go to folder python, run `python -m ui.main rank_attributes --projects={project_names}` (here `{project_names}` is a string split by comma, such as "addressbook,jpetstore"), the output is a list of ranked attributes stored in `results/ranked_attributes.json`. It is possible for you to add your own training file in `results/training`. Remember to follow the format in `results/training`.
Then go to the folder, run `python -m ui.main labeled_tests --project={project_name} --crawlfolder={crawl_folder_path}`
(here `{project_name}` is the name for project, `{crawlfolder_path}` is the absolute path of crawl folder generated by Crawljax, example `python -m ui.main labeled_tests --project=addressbook --crawlfolder=/Users/xyz/AST-2022-submission/crawl-results/addressbook`. Make sure there is a file `${crawl_folder_path}/Crawlpaths.json`). The output is file with labels (column name is "heuristic label") in `results/heuristic/{project_name}-labels.xlsx`

## Example
Folder `example` contains the labeled test cases. Here the default approach is KeyBert.
* `example/jpetstore/src/generated/GeneratedTests.java` is the test class generated by Crawljax

* `example/jpetstore/src/generated_labels/GeneratedTests.java` is the test class generated with our tool
