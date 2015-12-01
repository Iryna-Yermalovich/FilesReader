package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	private FileReader reader;
	
	public MyFileReader() {
	}

	public void readFile(String file) throws FileNotFoundException {
		try {
		    reader = new FileReader(file);
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			reader.close();
			System.out.println();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
