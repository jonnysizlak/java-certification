package com.geebles.chap01;

public interface InterfaceDeclaration {

	void abstractAndPublicAssumed();
	public void abstractAssumed();
	public abstract void nothingAssumed();
	abstract void publicAssumed();
	abstract public void nothingAssumedOtherOrder();
	
//	final void cantBeFinal();
//	static void cantBeStatic();
//	private void cantBePrivate();
//	protected void cantBeProtected();

	int CONSTANT1 = 1;
	public int CONSTANT2 = 2;
	public final int CONSTANT3 = 3;

}