package com.geebles.javacert.chap04;

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
		
		

	}
}