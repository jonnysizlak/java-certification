package com.geebles.chap02.animals;

public class Animal  {

	public static void dance() {
		System.out.println("Animal Dance!");
	} 

	public int legs = 2;

	public Animal() {
		System.out.println("Constructing Animal with this many legs: " +  legs);
	}

	public void eat() {
	}

}