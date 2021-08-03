package com.java;

public class PowerOf {

	public static void main(String[] args) {
		int a = 1000;
		PowerOf p = new PowerOf();
		System.out.println(p.pow(a));
		
	}
	boolean pow(int n) {
		while(n > 10 && n%10 == 0) {
			n/=10;
		}
		return n == 1;
	}
	
}
