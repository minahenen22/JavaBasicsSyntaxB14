package javaClass4;

import java.util.Scanner;

public class HimeWorkCc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String answer = scan.next();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("what is your balance in your card?");
			double balance = scan.nextDouble();
			if (balance >= 1000) {
				System.out.println("you should pay this off immediatly");
			} else {
				System.out.println("you can spend more");
			}
		} else {
			System.out.println("would you like to open one with us?");
		}

	}

}
