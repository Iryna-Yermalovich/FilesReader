package main;

import java.io.File;
import java.io.FileNotFoundException;

import util.MyFileInputStream;
import util.MyFileReader;
import util.MyInputStreamReader;

public class Runner {
	
	private static final String File_utf8 = "files\\UTF-8.txt";
	private static final String File_utf16LE = "files\\UTF-16LE.txt";
	private static final String File_utf16BE = "files\\UTF-16BE.txt";
	private static final String File_utf32LE = "files\\UTF-32LE.txt";
	private static final String File_utf32BE= "files\\UTF-32BE.txt";

	public static void main(String[] args) throws FileNotFoundException {
		MyFileReader obj1 = new MyFileReader();

		System.out.println("FileReader:\n");
		obj1.readFile(File_utf8);
		obj1.readFile(File_utf16LE);
		obj1.readFile(File_utf16BE);
		obj1.readFile(File_utf32LE);
		obj1.readFile(File_utf32BE);
		
		MyFileInputStream obj2 = new MyFileInputStream();

		System.out.println("\nFileInputStream:\n");
		obj2.readFile(File_utf8);
		obj2.readFile(File_utf16LE);
		obj2.readFile(File_utf16BE);
		obj2.readFile(File_utf32LE);
		obj2.readFile(File_utf32BE);
		
		MyInputStreamReader obj3 = new MyInputStreamReader();

		System.out.println("\nMyInputStreamReader:\n");
		obj3.readFile(File_utf8);
		obj3.readFile(File_utf16LE);
		obj3.readFile(File_utf16BE);
		obj3.readFile(File_utf32LE);
		obj3.readFile(File_utf32BE);
	}

}
