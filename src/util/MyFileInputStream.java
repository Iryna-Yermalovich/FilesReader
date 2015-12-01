package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {

	private FileInputStream inputStream;

	public MyFileInputStream() {
	}

	public void readFile(String file) throws FileNotFoundException {
		try {
			inputStream = new FileInputStream(file);
			int content;
			while ((content = inputStream.read()) != -1) {
				System.out.print((char) content);
			}
			System.out.println();
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
