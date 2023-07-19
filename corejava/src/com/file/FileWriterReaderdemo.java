package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderdemo {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw= new FileWriter("krish2.txt");
		String s = "This is file writer/reader demo using java";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("File Written Successfull");
		
		FileReader fr = new FileReader("krish2.txt");
		int i;
		while ((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	} 
}
