package com.sentax.cls07;

import java.util.Scanner;

public class HomeWork6 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double price=2.99;
	double money;
	
	 System.out.println("Pay for your coffee");
	 do {
		 money=scan.nextDouble();
		 if (money>price) {
			 System.out.println("Pay less amount");
		 }else if (money<price) {
			 System.out.println("Pay more");
		 }
		 
		 
		 
	 }while (price!=money);
	 System.out.println("Enjoy your coffee");
	
	 
	 
	
	
	
	
	
	
	
	
	
}
}
