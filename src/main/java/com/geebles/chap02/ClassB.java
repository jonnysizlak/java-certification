package com.geebles.chap02;

class ClassA {
	static String s = " ";
	static void method() { System.out.println("This shouldn't ever print."); }
}



public class ClassB extends ClassA {
	private ClassB() { s = "I feel like this shouldn't be possible."; }
	public static void main (String[] args) {
		ClassB b = new ClassB();
		b.method();
		System.out.println(s);
	}
}