package com.geebles.javacert.chap02;

import java.util.List;
import java.util.ArrayList;

public class Polymorphism {
	
	public void polymorphize() throws Exception {
		System.out.println("..without form!");
	}

	public void polymorphize(String form) throws Exception {
		System.out.println(form);
	}
	
	protected static int whatnow = 7;
	
	public static void main (String... args) throws Exception {
		List<Polymorphism> polys = new ArrayList<Polymorphism>();
		polys.add(new Polymorphism());
		polys.add(new Fire());
		polys.add(new Earth());
		polys.add(new Wind());
		polys.add(new Water());
		polys.add(new Heart());
		
		for(Polymorphism poly : polys) {
			poly.polymorphize();
		}
		
		Polymorphism p1 = new Polymorphism();
		p1.polymorphize("Cheese");
		
		Polymorphism p2 = new Water();
		p2.polymorphize("Cheese");
		
		new Polymorphism().poly(p1);
		new Polymorphism().poly(p2);
		
		if (p2 instanceof Water) {
			Water w = (Water) p2;
			w.getWet();
		}
		
		// Inheritance means jack to things that are static.
		System.out.println(Polymorphism.whatnow + " " + Water.whatnow);
	}
	
	public void poly(Polymorphism p) throws Exception {
		p.polymorphize();
		p.polymorphize("Cheese");
	}
	
	
	public void poly(Water w) {
		w.polymorphize();
		w.polymorphize("Cheez-whiz");
	}
}

class Water extends Polymorphism {
	// Subclasses don't need to throw exceptions just because the method they're overriding does.
	public void polymorphize() {
		System.out.println("Water!");
	}
	
	public void polymorphize(String form) {
		System.out.println(form + "!");
	}

	public void getWet() {
		
	}
	
	// Less restrictive is okay
	public static int whatnow = 8;

}

class Fire extends Polymorphism {
	public void polymorphize() {
		System.out.println("Fire!");
	}

}

class Wind extends Polymorphism {
	public void polymorphize() {
		System.out.println("Wind!");
	}
}

class Earth extends Polymorphism {
	public void polymorphize() {
		System.out.println("Earth!");
	}
}
	
class Heart extends Polymorphism {
	public void polymorphize() {
		System.out.println("Heart!");
	}
}
