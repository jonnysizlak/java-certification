package com.geebles.javacert.chap01.food;

public class Apple extends Fruit {
	public static void main(String... args) {
		Fruit apple = new Apple();
		apple.ripen();
	}

	public void ripen() {
		System.out.println("ready to eat.");
	}
}