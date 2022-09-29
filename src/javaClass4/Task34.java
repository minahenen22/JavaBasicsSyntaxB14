package javaClass4;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Please enter a number");
		    double num=scanner.nextDouble();
		    if(num % 2 == 0)
		    {System.out.println("Value is even");
		    
		    }
		     if (num % 2 != 0)
		    {System.out.println("Value is odd");}
		     
		      if (num % 2 == 0 && num<1000)
		       {System.out.println("Even value is just right");}
		      if (num % 2 != 0 && num>1000)
		       {System.out.println("Odd value is large");}
		    
		      if (num % 2 != 0 && num<1000)
		       {System.out.println("Odd value is just right");}
		      if (num % 2 == 0 && num>1000)
		     {System.out.println("Even value is large");}
	   
	    }
		

	}


