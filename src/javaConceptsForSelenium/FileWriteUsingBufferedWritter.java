package javaConceptsForSelenium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingBufferedWritter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "BufferedWriter.txt";
		String content = "Tested using buffered writer";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();

	}

}
