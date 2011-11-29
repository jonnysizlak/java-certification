package com.geebles.chap01;

import com.geebles.chap01.MemberModifiers;

public class OtherPackageMemberModifiers extends MemberModifiers {
	public static void main (String... args) {
			OtherPackageMemberModifiers mm = new OtherPackageMemberModifiers();

			// Public? No problem.
			int x = mm.publicField;
			x = mm.publicMethod();
			
			// Protected since I extend
			x = mm.protectedField;
			x = mm.protectedMethod();
			
			// Default since I extend and am in the same package
			x = mm.defaultField;
			x = mm.defaultMethod();

			// Private won't work
//			x = mm.privateField;
//			x = mm.privateMethod();
	}
}