package com.syntax.class05;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*3. Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000
		 * 
		 * 
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a number");
		int number=scan.nextInt();
		if (number==1&&number<10) {
			System.out.println("small number");}
			else if(number==11&&number<=100) {
				System.out.println("meduim number");
				
		}
			else if (number==101 && number>=1000) {
				System.out.println("large value");
			}

	}

}
