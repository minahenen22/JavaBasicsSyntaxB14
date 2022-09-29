package class12;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
		 */
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter Dad's name");
		String dad=scan.next();
		System.out.println("Enter Mom's name");
		String mom=scan.next();
		System.out.println("Boy or Girl");
		String gender=scan.next();
		
		if (gender.equals ("Boy")) {
			System.out.println(dad.substring(0,3)+ mom.substring(2,4));
			
		}
		else if (gender.equals("Girl")) {
			System.out.println(mom.substring(0,3)+ dad.substring(2,4));
		}else {
			System.out.println("Invalid Entry");
		}
		
		

	}

}
