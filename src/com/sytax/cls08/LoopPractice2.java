package com.sytax.cls08;

import java.util.Scanner;

public class LoopPractice2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num =10;
		int dig;
	
		
		do {System.out.println("guess the number");
		
		dig=scan.nextInt();
		}while(dig!=num);
		System.out.println("congrats");
		
		

	}

}
