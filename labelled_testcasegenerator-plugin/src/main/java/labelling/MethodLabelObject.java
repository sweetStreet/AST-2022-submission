package labelling;

import java.util.HashMap;

public class MethodLabelObject {
	String method_name;
	HashMap<Integer, LabelObject> label_map;

	public String getMethod_name() {
		return method_name;
	}
	public void setMethod_name(String method_name) {
		this.method_name = method_name;
	}
	public HashMap<Integer, LabelObject> getLabel_map() {
		return label_map;
	}
	public void setLabel_map(HashMap<Integer, LabelObject> labelMap) {
		this.label_map = labelMap;
	}
}
