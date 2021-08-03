package com.java;

abstract class Abstrct {
	
	int a;
	
	Abstrct(){
		System.out.println("Abstarct class constructor called");
		// we can create abstract class constructor
		this.a=10;
	}

	public void m() {
		System.out.println("Concrete method : "+a);
	}
	
	
}
