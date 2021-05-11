package com.java;

public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int rev;
		int temp = num;
		int sum = 0;
		while(num > 0) {
			rev = num % 10;
			num = num/10;
			sum = sum + rev*rev*rev;
		}
		if(temp == sum) {
			System.out.println("Arm");
		}else {
			System.out.println("Not Arm");
		}
		
	}
}
