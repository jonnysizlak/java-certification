package com.geebles.javacert.chap02;

public class ConstructorsAndInstantiation {
	public ConstructorsAndInstantiation(int arg1) {
		System.out.println(trouble);
	}
	
	public int trouble = 7;
	
	public static void main (String... args) {
		ConstructorsAndInstantiation cai = new ConstructorsAndInstantiation(1);
		System.err.println(cai.trouble);
	}
	
	
}
