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
		
		double d = 23.4567890D;
		double e = 456789012.02468F;
		
		//int nocommasallowed = 12,345,678;
		
		boolean t = true;
		// not allowed
		//boolean c = 1;

		int one = 106;
		int two = one + 5;
		int three = two - 1;
		int four = three + 11;
		
		System.out.println("" + (char) one + (char) two + (char) three + (char) three + (char) four);
		
		int tooBig = (int) 1234567890.1234567890;
		System.out.println("was 1234567890.1234567890, now " + tooBig);
		
		float tooShortToFloat = 3234.56F;
		short s = (short) tooShortToFloat;
		
		System.out.println("was 3234.56, now " + s);
				
		// + gives an int
		byte whatnow = 3;
		whatnow = (byte) (whatnow + 7);

		// += does an implicit cast back to byte
		whatnow = 3;
		whatnow += 7;
		
		// unless both are literal
		whatnow = 3;
		whatnow = 3 + 7;

		// unless both literals add up to be too big for a byte
		//whatnow = 65 + 65;
		
	}
}