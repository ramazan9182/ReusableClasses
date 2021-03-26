package com.yjs3509.finalModifier.main;

import com.yjs3509.finalModifier.domain.A;

public class Driver {

	public static void main(String[] args) {
		
		A a = new A(56);
//		a.value = 45.6; --> ILLEGAL
		
//		a.specialValue = 77; --> ILLEGAL
		
//		new A(100);
//		
//		new A(3);
		
		a.reference.dataValue = 5;
		
//		a.reference = new A();
	}
}
