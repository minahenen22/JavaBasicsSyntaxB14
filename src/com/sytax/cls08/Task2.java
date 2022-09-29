package com.sytax.cls08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the price of that item. 
Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
If user give more money program should return a change. 
Whenever user done with payments program should say "Thank you for shopping!"
		 */
		Scanner scan =new Scanner (System.in);
		System.out.println("What would you like to buy?");
		String item=scan.next();
		System.out.println("what is the price of "+item);
		double price=scan.nextDouble();
		
		double money;
		double total = 0;
		System.out.println("Please pay $"+price +" for your "+item);
		
		
		do {
			money=scan.nextDouble();
			total+=money;
			
			if (total<price) {
				double need;
				need=price-total;
				System.out.println("You need to pay more $"+need);
				
			}else if (total>price) {
				double change;
				change=total-price;
				System.out.println("Here is your change $"+ change);
				break;
			}
			
			
			
		}while (total != price);
		System.out.println("Thank you for shopping with us");
	

	}

}
