package javaClass4;

import java.util.Scanner;

public class HomeWork5Dmv {

	public static void main(String[] args) {
	Scanner scanner=new Scanner (System.in);
	
	System.out.println("What's your age?");
	int age=scanner.nextInt();
	if (age>=18)
	{System.out.println("congratualations, you are eligible for driver's license");}
	else
	{System.out.println("you can get learner's permit till age of 18");} 
			
	

	}

}
