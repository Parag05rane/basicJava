package com.java;

class StaticParent {

	public static void m() {
		System.out.println("Parent");
	}
	
}

class StaticChild extends StaticImp{
	/*
	 * public static void m() { //System.out.println("Child"); }
	 */
}

public class StaticImp{
	public static void main(String[] args) {
		//StaticChild.m();
	}
}