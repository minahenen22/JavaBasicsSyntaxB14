package com.syntax.class05;

public class HomeWork01Time {
	public static void main(String[] args) {
		int time=22;
		if (time>=1&&time<=11 ) {
			System.out.println("Morning");
		}else if (time>=12 &&time<=15) {
			System.out.println("Afternoon");
			
		}else if (time>=16 &&time<=20)
		{System.out.println("Eveining");}
		else if (time>=21 &&time<=24)
		{System.out.println("Night");}
		
	}

}
