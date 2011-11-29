package com.geebles.chap01;

public class MemberModifiers {
	public int publicField;
	public int publicMethod() { return publicField; }
	
	protected int protectedField;
	protected int protectedMethod() { return protectedField; }
	
	int defaultField;
	int defaultMethod() { return defaultField; }
	
	private int privateField;
	private int privateMethod() { return privateField; }

	public static void main (String... args) {
			MemberModifiers mm = new MemberModifiers();
			int x = mm.publicField;
			x = mm.publicMethod();
			x = mm.protectedField;
			x = mm.protectedMethod();
			x = mm.defaultField;
			x = mm.defaultMethod();
			x = mm.privateField;
			x = mm.privateMethod();
	}
}