package javaClass4;

import java.util.Scanner;

public class HomwWork1 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Do you have a Diploma?");
		
		boolean Diploma=scanner.nextBoolean();
		
		if(Diploma) {System.out.println("Congratulation");
		
			System.out.println("What is your GPA?");
		
		double gpa=scanner.nextDouble();
		if (gpa>=3.5) { 
		  System.out.println("You are eligible for scholarship");
		
		}
		 else {
			System.out.println("you should have studied harder");
			
		}
		}
	
		else {System.out.println("get a degree");}
		
		
	
}
		
}	
		
				
		
		
		

	


