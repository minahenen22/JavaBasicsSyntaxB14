package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkSwichTask3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter first number");
		int num1=scan.nextInt();
		System.out.println("please enter second number");
		int num2=scan.nextInt();
		System.out.println("choose one of the following (+,-,*,/)");
		char oper =scan.next().charAt(0);
		int result;
		
		switch (oper) {
		
		case '+':
			result= num1+num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '-':
		result=num1-num2;
		break;
		default:
			System.out.println("Invalid Input");
		result=0;
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
