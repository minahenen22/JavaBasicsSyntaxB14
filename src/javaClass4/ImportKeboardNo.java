package javaClass4;

import java.util.Scanner;

public class ImportKeboardNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your age");

		int age = scanner.nextInt();

		if (age < 18) {
			System.out.println("you should study");
		} else {
			System.out.println("you should be working");
		}

	}

}
