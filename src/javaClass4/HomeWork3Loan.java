package javaClass4;

import java.util.Scanner;

public class HomeWork3Loan {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
				System.out.println("What is the requested loan amount?");
				int loanAmount=scanner.nextInt();
		
		if(loanAmount<=200000) {System.out.println("your loan application will be considered");}
		else
		{System.out.println("your requested amount above bank's limit");}

	}

}
