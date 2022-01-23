package LabellingTests;

import java.util.List;

import org.junit.Test;

import labelling.MethodLabelObject;
import labelling.UtilsLabelling;

public class LabelImportTests {
	@Test
	public void importTest() {
		List<MethodLabelObject> imported = UtilsLabelling.importLabelJson("src/test/resources/testLabelJson.json");
		for(MethodLabelObject method: imported) {
			System.out.println(method.getMethod_name());
			System.out.println(method.getLabel_map());
		}
	}	
}
