package com.syntax.cls09;

public class HomeWork2Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 2. Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.

		 */
		
		String [] animals= {"Lion","Dog","Cat","Bird","Turtle"};
		for (String bread:animals) {
			System.out.print(bread+" ");
			
		}
		System.out.println();
		for (int i=0;i<animals.length;i++) {
			System.out.print(animals[i]+" ");
		}

	}

}
