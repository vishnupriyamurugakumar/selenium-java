package javaConceptsForSelenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteUsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "FileOutputStream.txt";
		String content = "Tested using FileOutputStream";
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		fileOutputStream.write(writeThis);
		fileOutputStream.close();
		
	}

}
