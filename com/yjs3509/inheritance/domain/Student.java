package com.yjs3509.inheritance.domain;

import com.yjs3509.composition.model.Person;

// Student is a person.

// Student is like the Person.

// keyword -- super

// keyword -- overriding --> @Override Annotation



public class Student extends Person{

	private double mark;
	
//	private Person person; // You can think this reference is exists as secret --> super
	static {
		System.out.println("selamm");
	}
	
	
	public Student() {
		this("UNKNOWN","UNKNOWN");
	}
	
	public Student(String firstName, String lastName) {
		super(firstName,lastName); // MUST BE FIRST CALL IN CONSTRUCTOR 
		System.out.println("Hello");
	}
	
	// instance method
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	public double getMark() {
		return mark;
	}
	
	
	public int f(int marker) {
		return marker * 2;
	}
	
	
	@Override
	public void f() {
		super.f();
		System.out.println("Student.f()");
	}
	
//	@Override
	public void b() {
		System.out.println("Student.b()");
	}
}
