package com.geebles.javacert.chap01.access;

import com.geebles.chap01.StuffToAccess;

public class Accessor extends StuffToAccess {

	public void access() {
		StuffToAccess sta = new StuffToAccess();
		Accessor a = new Accessor();
		System.out.println(sta.publicString);
//		System.out.println(sta.privateString);
//		System.out.println(sta.packageString);
//		System.out.println(sta.protectedString);
		System.out.println(a.protectedString);
	}
}
