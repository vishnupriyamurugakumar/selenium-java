package javaConceptsForSelenium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteUsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "Path.txt";
		String content = "Tested using Path";
		
		Path path = Paths.get(location);
		Files.write(path,content.getBytes());

	}

}
