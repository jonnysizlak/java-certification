package com.geebles.javacert.chap06;

import java.io.*;

public class Files {
	public static void main (String... args) {
		Files f = new Files();
		f.file1();
		f.file2();
	}

	public void file2() {
		try {
			File file = new File("afile.txt");
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write("hello world\n");
			writer.flush();
			writer.close();
			
			char[] in = new char[50];
			
			FileReader reader = new FileReader(file);
			int size = reader.read(in);
			for(int i = 0; i < size; ++i) {
				System.out.print(in[i]);
			}
			reader.close();
			file.delete();
		} catch (IOException ioe) { 
		}
	}
	
	
	public void file1() {
		try {
			File file = new File("afile.txt");
			System.out.println(file.exists());
			System.out.println(file.createNewFile());
			System.out.println(file.exists());
			System.out.println(file.delete());
			System.out.println(file.exists());
		} catch (IOException ioe) {
		
		}
	}
}