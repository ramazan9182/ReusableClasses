package com.yjs3509.inheritance.domain;

// Cartoon is a drawing.
public class Cartoon extends Drawing{
	static {
		System.out.println("Cartoon Static Block");
	}
	public Cartoon() {
		System.out.println("Cartoon()");
	}

}
