package com.geebles.chap01;

public abstract class FinalMethods {
	public final void finalMethod() {
		System.out.println("nyah nyah, you can't extend me!");
	}
	
	public void nonFinalMethod() {
		System.out.println("Extensorlate!");
	}
	
	public void finalParameters(int parameter, final int finalParameter, final Mutable mutant) {
		parameter = 1;
		// Can't assign final parameters.
		// finalParameter = 1;
		// Changing state via methods is cool
		mutant.changeState();
		// For a class to be truly final, it needs to have no methods on it that change state.
		
		// assigning to a new object entirely is not.
		//mutant = new Mutable();
	}
	
	abstract public void abstractMethod();
	
	private class Mutable {
		public void changeState() {
		}
	}
}