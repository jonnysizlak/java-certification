package com.geebles.chap02;

public class LegalReturnTypes {
	void go() {
	}
	
	int vamos(String s) {
		return 0;
	}
	
	LegalReturnTypes gogo() {
		return null;
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
