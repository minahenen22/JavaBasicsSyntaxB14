package com.syntax.cls09;

public class HomeWork4Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3. Create an array on integers and calculate the sum of all elements in an array

		/*
		 * 
		 * int [] num= {10,20,30,40,50};
		 */

		// for (int sum:num) {
		// if (sum==50) {

		//
		
		int []numbers= {10,20,30,40,50};
		int largest=numbers[0];
		for (int i=1;i<numbers.length;i++) {
			if (numbers[i]>largest) {
				largest=numbers[i];
				
			}
			
		}
		System.out.println(largest);
		
		System.out.println("**************************");
		
		largest=numbers[0];
		for (int n:numbers) {
			if (n>largest) {
				largest=n;
				
			}
		}
	}
}
