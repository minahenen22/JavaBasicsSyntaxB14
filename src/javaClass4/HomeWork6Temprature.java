package javaClass4;

import java.util.Scanner;


public class HomeWork6Temprature {
	public static void main (String[] args) {
	
	Scanner scanner= new Scanner (System.in);
	System.out.println("What is your city?");
	String city=scanner.nextLine();
	System.out.println("What is the tepmrature");
	int tempf=scanner.nextInt();
	double cels=(tempf-32)*5/9;
	System.out.println("the temprature of " +tempf + " in " + city + " is equivalent to " + cels );
	
	
	
	
	
	
	
	
	
	
	
	}
}
