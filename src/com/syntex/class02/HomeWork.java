package com.syntex.class02;

public class HomeWork {

	public static void main(String[] args) {
		
		int a= 300;
		int b= 200;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		int sum = a+b;
		int sub = a-b;
		int multi= a*b;
		int div =a/b;
		
		System.out.println("The sum of 2 number " +a+" and " +b+ " is equal to " +sum);
		System.out.println("the sum of 2 number "+a+" and " + b+ " equal to "+ sum);
		double c = 3.9;
		System.out.println("the sub of 2 numbers " +a+ " and " + b +" is " +sub);
		System.out.println("the mutiplication of 2 number "+a+" and "+b+" is " + multi);
		// task2
		double square= c*c;
		System.out.println("the square of the "+ c+" equal to " + square);
		// task3
		double hight=3.90;
		double width = 1.20;
		double perimeter = (hight+width)*2;
		double area = hight * width;
		System.out.println("the perimeter of a rectangle with width "+width+" and hight "+hight+" is equal to " +perimeter+ " and area is "+area);
				



	}

}
