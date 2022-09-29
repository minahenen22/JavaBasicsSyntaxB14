package com.syntax.cls09;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F.
//Then print a grade B (use 2 different ways of creating an array).
		char [] grades= new char [6];
		//int [] i= new  int [3];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[4]='F';
		System.out.println(grades[1]);
		
		char [] scores= {'A','B','C','D','E','F'};
		System.out.println(scores[1]);


	}

}
