package com.syntax.class05;

public class PracticeNo2 {
	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”,
		 *  anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		 */
		
		int day=7;
		if(day>=1 && day>=5)
		{System.out.println("it is a weekday");
		}
		else if(day>=6||day<=7){
		System.out.println("it is a weekend");
		}
		else {System.out.println("invalid date");}
		
	}

}
