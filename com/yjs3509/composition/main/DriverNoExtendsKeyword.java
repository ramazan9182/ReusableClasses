package com.yjs3509.composition.main;


class Person{
	
	private String fullName;
	
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	
}


class Student{
	
	private Person person;
	
	public Student() {
		this.person = new Person();
	}
	private void syout() {
		person.getClass();

	}
	
	
	public void setFullName(String fullName){
		person.setFullName(fullName);
	}
	
	
	public String getFullName() {
		return person.getFullName();
	}
	
}




public class DriverNoExtendsKeyword {

	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		
	}
	
	
}
