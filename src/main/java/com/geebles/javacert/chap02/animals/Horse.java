package com.geebles.chap02.animals;

public class Horse extends Animal {

	public static void dance () {
		System.out.println("Horse dance!");
	}

	int legs = 4;

	public Horse() {
		System.out.println("Constructing Horse with this many legs: " +  legs);
	}

	public void eat() {
	}

}