package com.geebles.chap02.animals;

public class Pony extends Horse {

	int legs = 8;

	public static void dance() {
		System.out.println("Pony Dance!");
	} 

	
	public static void main (String... args) {
		Pony p = new Pony(16);
		System.out.println(p.legs);
		Horse h = p;
		System.out.println("-----");
		h.dance();
		System.out.println("-----");
	}

	public Pony(int legs) {
		System.out.println("Constructing Pony with this many legs: " +  legs);
		this.legs = legs;
	}

	public void eat() {
	}

}

class Shetland extends Pony {
		// Since there is no no-arg constructor for Pony, Shetland needs to explicitly call the arg constructor.
		public Shetland(int legs) {
			super(legs);
		}
}