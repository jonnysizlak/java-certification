package com.geebles.javacert.chap03;

public class Parameters {

	private int x = 0;

	public static void main (String... args) {
		Parameters p = new Parameters();
		System.out.println(p.x);
		p.method1(p);
		// We passed a reference, x will have changed
		System.out.println(p.x);
		int y = 2;
		p.method2(y);
		// We passed a primitive value, y will remain the same
		System.out.println(y);
		
		int[][] array = new int[3][3];
		int[][] array2 = {{1,2,3},{4,5,6}};
		p.method3(new int[][]{{1,2,3},{4,5,6}});
		
		You stopped on page 231, Arrays of Object References.
	}
	
	public void method1(Parameters one) {
		one.x = 7;
	}
	
	public void method2(int y) {
		y = 7;
	}
	
	void method3(int[][] array) {}
}