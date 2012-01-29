package com.geebles.javacert.chap06;

import java.io.*;

public class Files {
	public static void main (String... args) {
		Files f = new Files();
		f.file1();

	}

	public void file2() {
	
	}
	
	
	public void file1() {
		try {
			File file1 = new File("afile.txt");
			System.out.println(file1.exists());
			System.out.println(file1.createNewFile());
			System.out.println(file1.exists());
			System.out.println(file1.delete());
			System.out.println(file1.exists());
		} catch (IOException ioe) {
		
		}
	}
}