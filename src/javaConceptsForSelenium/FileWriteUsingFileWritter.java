package javaConceptsForSelenium;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingFileWritter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "FileWriter.txt";
		String content = "Tested using file writer";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();

	}

}
