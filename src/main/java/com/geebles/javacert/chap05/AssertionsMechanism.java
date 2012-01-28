package com.geebles.javacert.chap05;

public class AssertionsMechanism {
	public static void main (String... args) {
		assert(args != null);
		assert(args == null): "Args in not null!";
	}
}