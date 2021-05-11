package com.java;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 343;
		int rev;
		int temp = num;
		int sum = 0;
		while(num > 0) {
			rev = num % 10;
			num = num/10;
			sum = sum*10 +rev;
		}
		if(temp == sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palin");
		}
		
	}

}
