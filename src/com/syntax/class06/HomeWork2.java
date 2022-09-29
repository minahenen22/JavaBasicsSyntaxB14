package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=scan.next().charAt(0);
		String explan;
		
		switch (grade) {
		case 'A':
			explan="Excellent";
			break;
		case 'B':
			explan="Good";
			break;
		case 'C':
			explan="Average";
			break;
		case 'D':
			explan="Bad";
			break;
			default:
				explan="Not Acceptable";
		
		
		}
		System.out.println("your grade is "+ grade+" which is "+explan);
		
		
		
		
		
	}

}
