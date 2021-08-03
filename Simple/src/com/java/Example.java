package com.java;

public class Example {

	public static void main(String[] args) {

		String str = "apple banana banana apple apple cake";
		int count = 0;
		String ar[] = str.split(" ");
		
		for(int i = 0; i < ar.length;i++) {
			if(ar[i].equals("apple")) {
				count= count+1;
			}
			
		}
		System.out.println(count);
		int no = str.split("apple",-1).length - 1;
		System.out.println(no);
		
		/*
		 * int a[] = {0,1,0,1,1,0};
		 * 
		 * Arrays.sort(a);
		 * 
		 * System.out.println(Arrays.toString(a));
		 * 
		 * List lt = Arrays.asList(a); System.out.println(a); lt.add(1);
		 * System.out.println(lt);
		 */
	}

}
