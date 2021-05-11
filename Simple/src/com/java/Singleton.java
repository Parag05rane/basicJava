package com.java;

public class Singleton {
	
	private Singleton(){};
	
	private static Singleton obj = null;
	
	public static Singleton getInstance(){
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

}
