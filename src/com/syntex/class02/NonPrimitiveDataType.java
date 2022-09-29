package com.syntex.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// String is date type of non primitive
		
		String name="Mina";
		String address="123 Main Street";
		int phone= 123456871;
		int age = 17;
		System.out.println("My Name IS "+name );
		System.out.println(name + " is "+ age);
		String fruit = "apple";
		double price = 1.99;
		System.out.println("The price of the " +fruit +" is "+ price);
		
		fruit= "mango";
		price=5.99;
		System.out.println("The price of the "+fruit+" is "+price);
		System.out.println("            ***************************       ");
		float  eightish = 8.2f;
	    float multi = (eightish*eightish);
	    System.out.println(multi);
	    System.out.println("the multiplication of "+eightish+" with itself equals to "+multi);
		

	}

}
