from pathlib import Path
import os


class Macros:
    this_dir: Path = Path(os.path.dirname(os.path.realpath(__file__)))
    python_dir: Path = this_dir.parent
    # "tackle-test-generator-ui-level/testlabeling"
    project_dir: Path = python_dir.parent
    paper_dir: Path = project_dir / "paper"
    results_dir: Path = project_dir / "results"
    frag_gen_results_dir: Path = results_dir / "frag-gen"
    downloads_dir: Path = project_dir / "downloads"
    models_dir: Path = project_dir / "models"

    out_dir: Path = project_dir / "out"

    crawljax_dir: Path = project_dir.parent / "crawljax"

    collector_dir: Path = project_dir / "collector"
    collector_version = "0.1-dev"

    JAVA_HOME = "/Library/Java/JavaVirtualMachines/jdk-11.0.12.jdk/Contents/Home"

    project_list = ["addressbook", "claroline", "collabtive", "dimeshift", "jpetstore", "mantisbt", "mrbs", "pagekit",
                    "petclinic", "phoenix", "ppma", "retroboard", "splittypie"]

    model_save_path = str(models_dir / "paraphrase-MiniLM-L3-v2.pt")