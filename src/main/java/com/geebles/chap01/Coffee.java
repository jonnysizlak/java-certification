package com.geebles.chap01;enum CoffeeSize { 	TALL(12), GRANDE(16), VENTI(20);	private int ounces;		CoffeeSize(int ounces) {		this.ounces = ounces;	}		public int getOunces() {		return ounces;	} } public class Coffee {	enum CoffeeType { CORSICIAN, HAZELNUT, DECAF } 	CoffeeSize size;	CoffeeType type;	public static void main (String... args) {		Coffee c = new Coffee();		c.size = CoffeeSize.TALL;		System.out.println(c.size.getOunces());				c.type = Coffee.CoffeeType.DECAF;	}}