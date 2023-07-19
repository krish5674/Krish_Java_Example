package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStream {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("krish1.txt");
		String s = "This is file management demo using python";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("Data written successfully");
		
		FileInputStream fis = new FileInputStream("krish1.txt");
		int i;
		while ((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}

}
