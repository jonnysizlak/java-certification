package com.geebles.chap01;public class Constructors {	private int x = 1;		public void setX (int x) {		this.x = x;	}		public static void main (String... args) {		Constructors c = new Constructors();		c.print();		c.setX(2);		System.out.println(c.x);	}	public Constructors() {		System.out.println("Construct!");	}		public void print() {		System.out.println("Print!");	}}