package javaConceptsForSelenium;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject =  new JSONObject();
		jsonObject.put("Name", "Vishnu");
		jsonObject.put("Age", 25);

		JSONArray array =  new JSONArray();
		array.add("Test11");
		array.add("Test22");

		jsonObject.put("Tests", array);

		FileWriter fileWriter =  new FileWriter("vishnu.json");
		fileWriter.write(jsonObject.toString());

		fileWriter.close();


	}

}
