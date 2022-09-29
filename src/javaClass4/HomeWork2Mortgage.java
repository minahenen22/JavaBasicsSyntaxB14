package javaClass4;

import java.util.Scanner;

public class HomeWork2Mortgage {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("What is Mortgage rate?");
		double mortgageRate=scan.nextDouble();
		if (mortgageRate>4.5)
		{System.out.println("will not buy the house");}
		else{
			System.out.println("What is the house price?");}
		int price=scan.nextInt();
		if (price>20000) {
			System.out.println("I will take a loan");
			}
		else
		{System.out.println("i will buy it cash");}

	}

}
