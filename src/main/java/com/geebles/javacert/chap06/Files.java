package com.geebles.javacert.chap06;

import java.io.*;

public class Files {
	public static void main (String... args) {
		Files f = new Files();
		f.file1();
		f.file2();
		f.directory();
		f.directory2();
	}

	public void directory2() {
		try {
			File dir = new File("dir");
			dir.mkdir();
			File file = new File(dir, "afile.txt");
			file.createNewFile();
			
			File newname = new File(dir, "newName.txt");
			file.renameTo(newname);
			
			File newdir = new File("newdir");
			dir.renameTo(newdir);
			
			System.out.println("====================");
			for(String current : newdir.list()) {
				System.out.println(current);
			}
			System.out.println("====================");

			System.out.println("deleted newname? " + newname.delete());
			System.out.println("deleted newdir? " + newdir.delete());
			
			} catch (IOException ioe) {
		}
	}
	
	public void directory() {
		try {
			File dir = new File("temp");
			dir.mkdir();
			dir.delete();
			File file = new File(dir, "afile.txt");
			file.createNewFile();
			file.delete();
			System.out.println(dir.delete());
		} catch (IOException ioe) {
		}
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