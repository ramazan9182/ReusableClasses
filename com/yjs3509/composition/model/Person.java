package com.yjs3509.composition.model;

public class Person {

	// composition

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("haahahha");
	}

	static {
		System.out.println("burasý il çalýþýr");
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// setter for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// getter for firstName
	public String getFirstName() {
		return firstName;
	}

	// getter for lastName
	public String getLastName() {
		return lastName;
	}
	
	
	public void f() {
		System.out.println("Person.f()");
	}
	
	
}
