package com.geebles.javacert.chap06;

public class Strings {
	public static void main (String... args) {
		String s = new String("string");
		s = "string";
		
		System.out.println(s.charAt(2));
		System.out.println(s.concat(s));
		
		String sS = "sTrInG";
		System.out.println(s.equalsIgnoreCase(sS));
		
		System.out.println(sS.length());
		
		System.out.println(sS.replace('T', 't'));
		
		String subme = "0123456789";
		
		System.out.println(subme.substring(2));
		System.out.println(subme.substring(2, 9));
		
		System.out.println(sS.toLowerCase());
		System.out.println(sS.toUpperCase());
		System.out.println(sS.toString());
		
		String spaces = "    <---   --->    ";
		System.out.print("|");
		System.out.print(spaces.trim());
		System.out.print("|");
		System.out.print(spaces);
		System.out.println("|");

		System.out.println("======================");
		
		StringBuilder builder = new StringBuilder("");
		int count = 999999;
		String badger = " badger";
		
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; ++ i) {	
			builder.append(badger).append(badger);
		}
		System.out.println(System.currentTimeMillis() - start);
		builder.reverse();
		
		
		StringBuffer buffer = new StringBuffer("");
		start = System.currentTimeMillis();
		for (int i = 0; i < count; ++ i) {
			buffer.append(badger).append(badger);
		}
		System.out.println(System.currentTimeMillis() - start);
		buffer.reverse();
		
	}
}
