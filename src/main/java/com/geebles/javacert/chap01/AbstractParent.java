package com.geebles.javacert.chap01;

public abstract class AbstractParent {

	// The extending classes do not copy the implementation out; they defer to the class.
	// So if you extend a class, and that class' implementation is updated, you'll use
	// the updated implementation.
	public void output() {
		// System.out.println("Orignal implementation.");
		System.out.println("Updated implementation.");
	}
}