package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkIfElseTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		System.out.println("select from the followin (+,-,*,/)");
		char order=scan.next().charAt(0);
		int result = 0;
		boolean wrongoperator=false;
		if (order=='+') {
		
			result=num1+num2;
			
		}else if(order=='-') {
			
			result=num1-num2;
		}else if (order=='*') {
			
			result=num1*num2;
		}else if (order=='/')
		
		result=num1/num2;
		else {
		 System.out.println("Invalid Input");}
		wrongoperator=true;
		if(order!='+'||order!= '-'||order!= '*'||order!= '/' ) {
			System.out.println("ebter valid op");}
		else {
		System.out.println(result);
		
			
			
		

}

}
}

