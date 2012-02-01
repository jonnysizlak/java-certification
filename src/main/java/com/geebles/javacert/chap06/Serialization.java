package com.geebles.javacert.chap06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {

	public String s1 = "Hello World";
	public String s2 = "Hey there.";

	public static void main(String... args) {
	
		Serialization s = new Serialization();
		s.s2 = "Hola Aqui";
		
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(s);
			os.close();
		} catch (Exception e ) {
			System.err.println("Couldn't write!");
			e.printStackTrace();
		}
		
		s.s2 = "Hey there.";
		s.s1 = "Good morning, starshine.";
		
		try {
			File file = new File("testSer.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream is = new ObjectInputStream(fis);
			Serialization s2 = (Serialization) is.readObject();
			is.close();
			System.out.println("s.s1: " + s.s1);
			System.out.println("s.s2: " + s.s2);
			System.out.println("s2.s1: " + s2.s1);
			System.out.println("s2.s2: " + s2.s2);
			file.delete();
		} catch (Exception e) {
			System.err.println("Couldn't read!");
			e.printStackTrace();		
		}
		
		System.out.println("===================");
		
		try {
			Dog d = new Serialization().new Dog();
			d.c = new Serialization().new Collar();
			
			d.size = 4;
			d.c.size = 2;
			File dogser = new File("dog.ser");
			FileOutputStream fs = new FileOutputStream(dogser);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
			
			FileInputStream fis = new FileInputStream(dogser);
			ObjectInputStream is = new ObjectInputStream(fis);
			Dog dog = (Dog) is.readObject();
			is.close();
			
			System.out.println("dog.size: " + dog.size);
			System.out.println("dog.c.size: " + dog.c.size);
			
			dogser.delete();
		} catch (Exception e ) {
			System.err.println("Couldn't write!");
			e.printStackTrace();
		}
		
	}
	
	class Dog implements Serializable {
		int size = 3;
		transient Collar c;
		
		private void writeObject(ObjectOutputStream os) {
			try {
				os.defaultWriteObject();
				os.writeInt(c.size);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private void readObject(ObjectInputStream is) {
			try {
				is.defaultReadObject();
				c = new Collar();
				c.size = is.readInt();
			} catch (Exception e) {
			
			}
		}
	}
	
	class Collar {
		int size = 3;
	}
}
