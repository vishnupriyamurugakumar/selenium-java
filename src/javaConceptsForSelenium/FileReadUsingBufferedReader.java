package javaConceptsForSelenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "BufferedWriter.txt";

		FileReader fileReader = new FileReader(location);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String contents;

		while((contents = bufferedReader.readLine())!=null) {
			System.out.println(contents);

		}


	}

}
