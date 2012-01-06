package com.geebles.chap01;

public final strictfp class ClassDeclarations {

	// all modifiers are valid on subclass definitions
	public class PublicSubclass {}
	protected class ProtectedSubclass {}
	class PackageSubclass{}
	private class PrivateSubclass {}
	

}

// only one public class per file
//public class PublicClass {}

// protected is not valid on class definitions
//protected class ProtectedClass {}

class PackageClass{}

// private is not valid on class definitions
//private class PrivateClass {}