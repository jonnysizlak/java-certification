package com.geebles.javacert.chap04;

import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class Operators {
	public static void main (String... args) {
		
		// Compound operators
		int y = 6;
		y = y - 6;
		y =- 6; // =- isn't "minus equal six"! it's "equals negative six", which is something totally different.
		y += 15;
		
		System.out.println(y);
		System.out.println("-----------");
		
		int x = 5;
		x = x + 2 * 5;
		x += 2 * 5;
		
		// Relational operators
		// can be assigned to bools
		boolean b = x > y;
		
		String animal = "unknown";
		int weight  = 700;
		char sex = 'm';
		double colorWaveLength = 1.630;
		if (weight >= 500) {
			animal = "elephant";
		}
		if (colorWaveLength > 1.621) {
			animal = "grey " + animal;
		}
		
		if (sex <= 'f') {
			animal = "female " + animal;
		} else {
			animal = "male " + animal;
		}
		
		System.out.println(animal);
		System.out.println("-----------");
		
		
		System.out.println("'a' == 'a' : " + ('a' == 'a'));
		System.out.println("'a' == 'b' : " + ('a' == 'b'));
		System.out.println("5 == 5.0 : " +  (5 == 5.0));
		System.out.println("5 == 6 : " + (5 == 6));
		System.out.println("true == false: " +  (true == false));
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		System.out.println("o1 == o1 : " + (o1 == o1));
		System.out.println("o1 == o2 : " + (o1 == o2));
		System.out.println("o1 == o3 : " + (o1 == o3));
		
		System.out.println("-----------");
		Color c1 = Color.RED;
		Color c2 = Color.RED;
		Color c3 = Color.GREEN;
		Color c4 = Color.BLUE;

		System.out.println("c1 == c1 : " + (c1 == c1));
		System.out.println("c1 == c2 : " + (c1 == c2));
		System.out.println("c1 == c3 : " + (c1 == c3));
		System.out.println("c1 == c4 : " + (c1 == c4));

		System.out.println("c1.equals(c1) : " + (c1.equals(c1)));
		System.out.println("c1.equals(c2) : " + (c1.equals(c2)));
		System.out.println("c1.equals(c3) : " + (c1.equals(c3)));
		System.out.println("c1.equals(c4) : " + (c1.equals(c4)));

		System.out.println("-----------");

		Object string = "";
		Object buffer = new StringBuffer();
		Object builder = new StringBuilder();
		
		System.out.println("string instanceof String: " + (string instanceof String));
		System.out.println("buffer instanceof String : " + (buffer instanceof String));
		System.out.println("builder instanceof String : " + (builder instanceof String));
		System.out.println("string instanceof Object : " + (string instanceof Object));
		System.out.println("null instanceof Object : " + (null instanceof Object));
		
		int[] array = new int[10];
		System.out.println("array instanceof Object : " + (array instanceof Object));
		
		You stopped on page 298, Arithmetic Operators.
		
	}
	
	enum Color { RED, GREEN, BLUE } // the semicolor is optional after an enum declaration
	
}