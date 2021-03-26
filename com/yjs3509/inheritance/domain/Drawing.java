package com.yjs3509.inheritance.domain;

// Drawing is a art.
public class Drawing extends Art {
	
	static {
		System.out.println("Drawing Static Block");
	}
	
	public Drawing() {
		System.out.println("Drawing()");
	}
}
