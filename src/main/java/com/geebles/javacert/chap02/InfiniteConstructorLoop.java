package com.geebles.chap02;

public class InfiniteConstructorLoop {
	InfiniteConstructorLoop() {
		// Compiler won't let an infinite constructor loop happen.
		//this("hello");
	}

	InfiniteConstructorLoop(String s) {
		this();
	}
}