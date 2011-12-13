package com.geebles.javacert.chap03;

public class Literals {
	public static void main (String... args) {
		char b = 'b';
		int x = 1;
		int y = 011;
		int z = 0xDeAdBeEf;
		x = b;
		b = (char) x;
		
		System.out.println(x);
		System.out.println(b);
		System.out.println(y);
		System.out.println(z);
		
		// literal non-ints go straight to double, unless you use the F suffix
		//float f = 23.4567890;
		float g = 456789012.02468F;
		
	}
}