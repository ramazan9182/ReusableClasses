package com.yjs3509.finalModifier.domain;

public class A {

	public final static double value;
	public final double specialValue;
	public final double specialValue2;
	public final Data reference;
	
	static {
		value = 90.0;
	}
	
	{
		specialValue2 = 88; 
	}
	
	public A(int specialValue) {
		this.specialValue = specialValue;
		this.reference = new Data();
		//this.value = 45; // MULTIPLE ASSIGNMENT
//		this.specialValue = 88; // ILLEGAL
	}
	
	
	public void f(final int a) {
		//a = 45; // ILLEGAL
	}
	
	public final void method() {
		
	}
	
	private void privateMethodsAreAlsoFinal() {
		
	}
	
}
