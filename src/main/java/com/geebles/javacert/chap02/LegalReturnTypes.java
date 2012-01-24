package com.geebles.javacert.chap02;

public class LegalReturnTypes {
	void go() {
	}
	
	int vamos(String s) {
		return 0;
	}
	
	LegalReturnTypes gogo() {
		return null;
	}
	
	public String nullReturn() {
		return null;
	}
	
	public String[] arrayReturn() {
		return new String[] {"Red", "Black", "Blue"};
	}
	
	public int returnImplicitConversion() {
		char c = 'c';
		return c;
	}
	
	public int returnExplicitCast() {
		float f = 32.5f;
		return (int) f;
	}
	
	public void noReturnOnVoid() {
//		return null;
//		return 1;
//		return true;
		return;
	}
	
	public LegalReturnTypes returnImplicitCast() {
		return new Override();
	}
}

class Override extends LegalReturnTypes {
	// If I change the argument list, I can change the return type.
	int go(String s) {
		return 0;
	}
	
	int vamos(String s) {
		return 0;
	}
	
	// No bueno. Can't change *only* the return type.
//	int gogo() {
//		return null;
//	}

//	...unless you're changing it to a subclass.
	Override gogo() {
		return null;
	}
}
