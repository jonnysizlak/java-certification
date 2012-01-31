package com.geebles.javacert.chap06;

import java.io.Console;

public class NewConsole {

	public static void main (String... args) {
		Console c = System.console();
		char[] pw;
		pw = c.readPassword("%s", "pw: ");
		for (char ch : pw) {
			c.format("%c", ch);
		}
		c.format("\n");
		
		while (true) {
			String name = c.readLine("%s", "input: ");
			if (name.equals("exit")) {
				break;
			}
			c.format("output: %s \n", name.toUpperCase());
		}
	}
}