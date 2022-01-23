package labelling;

/*
 * Java Bean for deserializing label json
 */
public class LabelObject {
	/*
	"context_label": "login remember",
	"details": {
		"attributes": {
			"class": "postfix button secondary expand"
		},
		"tag": "A",
		"text": ""
	},
	"diff_label": "entry tag",
	"edge_label": " secondary expand",
	"label": " login remember entry tag secondary expand",
	"manual_label": "log in"
	*/

	public String getEdge_label() {
		return edge_label;
	}

	public void setEdge_label(String edge_label) {
		this.edge_label = edge_label;
	}

	public String getDiff_label() {
		return diff_label;
	}

	public void setDiff_label(String diff_label) {
		this.diff_label = diff_label;
	}

	public String getContext_label() {
		return context_label;
	}

	public void setContext_label(String context_label) {
		this.context_label = context_label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getManual_label() {
		return manual_label;
	}

	public void setManual_label(String manual_label) {
		this.manual_label = manual_label;
	}

	public ElementInfo getDetails() {
		return details;
	}

	public void setDetails(ElementInfo details) {
		this.details = details;
	}

	String edge_label;
	String diff_label;
	String context_label;
	String label;
	String manual_label;
	ElementInfo details;

}
