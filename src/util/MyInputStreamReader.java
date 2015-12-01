package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyInputStreamReader {

	public MyInputStreamReader() {
	}

	public void readFile(String file) {
		try {
			Reader inputStreamReader = new InputStreamReader(new FileInputStream(file));

			int data = inputStreamReader.read();
			while (data != -1) {
				char theChar = (char) data;
				data = inputStreamReader.read();
			}
			System.out.println();
			inputStreamReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
