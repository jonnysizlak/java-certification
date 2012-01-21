package com.geebles.javacert.chap05;

public class LoopsAndIterators {
	public static void main (String... args) {
		int x = 1;
		while (x <= 2) {
			System.out.println(x);
			++x;
		}
		
		// not allowed
		// while (int y = 7) {}
		int y = 7;
		while (y != 7) {}
		
		do {
			System.out.println("Does anyone ever use do while loops?");
			++y;
		} while (10 >= y);
		
		// the shortest infinite loop ever:
		//for(;;);
		
		int c = 0;
		for (int i = 10; i > 0; --i) {
			for (int j = 0; j < i; ++ j){
				System.out.print("Burpee! ");
				++c;
			}
			System.out.println();
		}
		System.out.println(c + " burpees!");
		
	}
}