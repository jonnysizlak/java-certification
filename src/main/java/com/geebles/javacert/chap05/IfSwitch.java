package com.geebles.javacert.chap05;

public class IfSwitch {
	public static void main (String... args) {
		boolean booleanExpression = true;
		if (booleanExpression) {
			System.out.println("If statements are fun!");
		}
		if (!booleanExpression) {
			System.out.println("Dead code.");
		} else {
			System.out.println("Else statements are good too I guess.");
		}
		
		int x = 3;
		// look ma no braces
		if (x > 3)
			System.out.println("x is greater than three");
		else
			if (x == 3)
				System.out.println("x is equal to three and nested if else statements are terribad");
			else 
				System.out.println("x is less than three and nested if else statements are terribad");
			
		if (x > 3) {
			System.out.println("x is greater than three");
		} else if (x == 3) {
			System.out.println("x is equal to three and else if is better I guess");
		} else {
			System.out.println("x is less than three and else if is better I guess");
		}		
		
		if (x > 3) {
			System.out.println("x is greater than three but I missed a case");
		} else if (x < 3) {
			System.out.println("x is less than three but I missed a case");
		}
		
		x = 5;
		switch (x) {
			case 1: {
				System.out.println("x = 1");
				break;
			}
			case 2: {
				System.out.println("x = 2");
				break;
			}
			case 3: {
				System.out.println("x = 3");
				break;
			}
			case 4: {
				System.out.println("x = 4");
				break;
			}
			default: {
				System.out.println("x = ???");
			}
		}
		
		Byte b =  new Byte((byte) 42);
		switch (b) {
			// autoboxing will take care of this
			case 42:
				System.out.println("blah blah blah");
			// Won't compile; can't duplicate labels
			// case 23:
			// Won't compile; 128 won't fit in a byte
			// case 128

		}
		
		Color red = Color.RED;
		switch (red) {
			case GREEN: {
				System.out.println("Green!");
			}
			case RED: {
				System.out.println("Red!");
			}
			case YELLOW: {
				System.out.println("Yellow!");
			}
			case BLUE: {
				System.out.println("Blue!");
			}
			default: {
				System.out.println("Why did you forget the break statements?");
			}
		}
		
		char c = 'j';
		switch (c) {
			case 'j': {
				System.out.print('j');
			}
			case 'o': {
				System.out.print('o');
			}
			case 'n': {
				System.out.print("nn");
			}
			case 'i': {
				System.out.print('y');
			}
			default: {
				System.out.println('!');
			}
		}
	}
	
	enum Color { RED, BLUE, GREEN, YELLOW };
}