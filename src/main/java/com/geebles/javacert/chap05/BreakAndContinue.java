package com.geebles.javacert.package com.geebles.javacert.chap01;

public class BreakAndContinue {

	public static void main (String... args) {
		for (int i = 0; i < 78; ++i) {
			if (i == 2) {
				continue;
			}
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("====================");
		
		outer:
		for (int i = 0; i < 5; ++ i) {
			System.out.println("outer");
			inner:
				System.out.println("inner"); 
				for (int j = 0; j < 5; ++ j) {
					if (j == 4) {
						System.out.println("breaking");
						;
					}
					if (i == 1) {
						System.out.println("continuing");
						continue;
					}
					System.out.println("I have no idea when this will print out: " + i + " : " + j);
				}
			}
		System.out.println("====================");
		int age = 0;
		outer:
			while (age < 100) {
				++age;
				if (age == 16) {
					System.out.println("Get your driver's license.");
					continue;
				}
				if (age == 21) {
					System.out.println("Alcohol poisoning.");
					break outer;
				}
				System.out.println("Another year...");
			}
	}
}