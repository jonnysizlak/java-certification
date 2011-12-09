package com.geebles.chap02;

import java.util.List;
import java.util.ArrayList;

public class Polymorphism {
	
	public void polymorphize() {
		System.out.println("..without form!");
	}
	
	public static void main (String... args) {
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
	}
}

class Water extends Polymorphism {
	public void polymorphize() {
		System.out.println("Water!");
	}

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
