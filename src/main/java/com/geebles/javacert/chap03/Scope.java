package com.geebles.javacert.chap03;

public class Scope {

	private int x = 5;

	Object ref;
	byte byt;
	float flo;
	boolean boo;
	char cha;
	
	
	public static void main (String... args) {
		// won't compile, non-static variable x cannot be referenced from a static context
		//x++;
		int y = 5;
		Scope s = new Scope();
		s.defaultValues();

		for (int i = 0; i < 10; ++i) {
			i += s.x + y;
		}
	}
	
	public void defaultValues() {
		System.out.println(ref);
		System.out.println(byt);
		System.out.println(flo);
		System.out.println(boo);
		System.out.println("[" + cha + "]");
		int newvar;
		// won't compile -- local variables don't get initialized.
		//System.out.println(newvar);
		
		Object object;
		// same deal, not initialized is not null
		//if (object == null) {}
	}
}