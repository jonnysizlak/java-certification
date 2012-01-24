package com.geebles.javacert.chap05;

import java.util.logging.Level;
import javax.crypto.Mac;

public class CommonExceptionsAndErrors {
	static String s;

	public static void main (String... args) throws Exception {
		try {
			s.length();
		} catch (NullPointerException npe) {
			System.out.println("Null pointer exception caught: " + npe.getMessage());
		}

		try {
			overflow();
		} catch (StackOverflowError soe) {
			System.out.println("Stack overflow exception caught: " + soe.getMessage());
		}
		
		try {
			Integer.parseInt("seven");
		} catch (NumberFormatException nfe ) {
			System.out.println("Number format exception caught: " + nfe.getMessage());
		}

		try {
			int[] seven = { 1, 2, 3, 4, 5 };
			int x = seven[7];
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Out of bounds exception caught: " + aioobe.getMessage());
		}

		try {
			Object o = new Integer(7);
			String s = (String) o;
		} catch (ClassCastException cce ) {
			System.out.println("Class cast exception caught: " + cce.getMessage());
		}

		try {
			Level.parse("not a log level");
		} catch (IllegalArgumentException iae) {
			System.out.println("Illegal Argument exception caught: " + iae.getMessage());
		}

		try {
			Mac.getInstance("HmacMD5").doFinal();
		} catch (IllegalStateException ise) {
			System.out.println("Illegal State exception caught: " + ise.getMessage());
		} 

		try {
			assert(false): "The preceeding statement is false";
		} catch (AssertionError ae ) {
			System.out.println("Assertion exception caught: " + ae.getMessage());
		}

		// Other exceptions worth knowing about but too much work to create:
		//   ExceptionInInitializerError
		//   NoClassDefFoundError
		
	}
	
	public static void overflow() {
		overflow();
	}
}