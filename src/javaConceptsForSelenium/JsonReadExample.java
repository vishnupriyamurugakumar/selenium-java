package javaConceptsForSelenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonParser= new JSONParser();
		FileReader fileReader= new FileReader("vishnu.json");
		Object Object = jsonParser.parse(fileReader);
		JSONObject jsonObject=(JSONObject) Object;
		String name = (String) jsonObject.get("Name");
		long age = (long) jsonObject.get("Age");
		JSONArray array = (JSONArray) jsonObject.get("Tests");
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		
		Iterator iterator = array.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Tests : " + iterator.next());
		}

		
		
	}

}
