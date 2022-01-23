package labelling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class UtilsLabelling {
	public static List<MethodLabelObject> importLabelJson(String jsonLocation){
		try {
			Gson gson = new Gson();
			Type typeOfObjectsList = new TypeToken<ArrayList<MethodLabelObject>>() {
			}.getType();
			List<MethodLabelObject> labelMap = gson.fromJson(new FileReader(jsonLocation), typeOfObjectsList);
			return labelMap;
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
}
