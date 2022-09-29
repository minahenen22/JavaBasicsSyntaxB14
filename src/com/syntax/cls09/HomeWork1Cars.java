package com.syntax.cls09;

public class HomeWork1Cars {
public static void main(String[] args) {
	//
	/*
	 * HW. 1. Create an array of cars and store 6 elements into it. 
	 * Using 2 different loops print all values from the array.

	 */
	String []cars= {"BMW","Tesla","Audi","Benz","Buick","Cadilac"};
	for (String make:cars) {
		System.out.print(make+" ");
	}
	System.out.println();
		String [] brand=new String[6];
		brand[0]="BMW";
		brand[1]="Tesla";
		brand[2]="Audi";
		brand[3]="Benz";
		brand[4]="Buick";
		brand[5]="Cadilac";
		for (int i=0;i<brand.length;i++) {
			System.out.print(brand[i]+" ");
		}
		
		
	
	
}
}
