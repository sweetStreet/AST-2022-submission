package labelling;

import java.util.HashMap;
import java.util.Map;

public class ElementInfo {
	/*
	 "details": {
                "attributes": {
                    "evlist": "false",
                    "href": "#",
                    "onclick": "document.logout.submit();"
                },
                "tag": "A",
                "text": "Logout"
            },
	 */
	
	Map<String, String> attributes = new HashMap<>();
	String tag;
	String text;
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
