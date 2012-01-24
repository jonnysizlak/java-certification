package com.geebles.javacert.chap05;

public class HandlingExceptions {
	public static void main (String... args) throws Exception {
		try {
			System.out.println("Starting the try block...");
			boolean tru = true;
			if (tru) throw new Exception();
			System.out.println("Ending the try block...");
		} catch (Exception e) {
			System.out.println("Starting the catch block...");
			System.out.println("Ending the catch block...");
		} finally {
			System.out.println("Starting the finally block...");
			System.out.println("Ending the finally block...");		
		}

		System.out.println("=====================");				

		try {
			System.out.println("We don't need no steenkin' catches!");
		} finally {
			System.out.println("...so long as we have a finally block");				
		}

		System.out.println("=====================");				

		try {
			System.out.println("We don't need no steenkin' catches!");
			throw new Exception();
		} 
		// System.out.println("Can't have code between trys and catches");
		catch (Exception e) {
			System.out.println("...so long as we have a catch block");				
		}
		
		System.out.println("=====================");				

		try {
			methodOne();
		} catch (Exception e) {
			System.out.println("Catching exception in main()");
		}
		
	}
	
	public static void methodOne() throws Exception {
		methodTwo();
	}
	public static void methodTwo() throws Exception {
		methodThree();
	}
	public static void methodThree() throws Exception {
		System.out.println("Throwing exception in methodThree()");
		throw new Exception();
	}
}