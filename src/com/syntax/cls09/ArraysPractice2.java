package com.syntax.cls09;

public class ArraysPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		String [] names=new String[10];
		names [0]="MAT";
		names [1]="MIKE";
		names [2]="SAM";
		names [3]="RAFAEL";
		names [4]="SAMY";
		names [5]="SAIRA";
		names [6]="FRED";
		names [7]="Mina";
		names [8]="TOM";
		names [9]="GREG";
		
		System.out.println(names[7]);
		
		String [] yourName= {"MAT","MIKE","SAM","RAFAEL","SAMY","SAIRA","FRED","Mina","TOM","GREG"};
		System.out.println(yourName[7]);
		int size=yourName.length;
		System.out.println(size);
		int i=names.length;
		System.out.println(i);
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.

		 */

	}

}
