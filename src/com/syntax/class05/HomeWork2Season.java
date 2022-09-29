package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("what is your birth month");
		String month=scan.next();
		if (month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May"))
		{System.out.println("Spring");}
		else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August"))
		{System.out.println("Summer");}
		else if (month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February"))
		{System.out.println("Winter");}
		else if (month.equalsIgnoreCase("Septemper")||month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November"))
		{System.out.println("Automn");}
		
		
			
		
		

	}

}
