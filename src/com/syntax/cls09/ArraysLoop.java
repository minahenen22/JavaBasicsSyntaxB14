package com.syntax.cls09;

public class ArraysLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] iceCream= {"vanilla", "chocolate","pistachio","kulfi", "mango"};
        for(int i=0; i<iceCream.length; i++) {
            System.out.print(iceCream[i]+" ");
            

	}
        System.out.println();
        
       //enhanced for loop / for each loop
        
        String [] cars= {"BMW","Accura","BENZ","Corvette"};
        for (String make:cars) {
        	System.out.print(make+" ");
        	
        }
        
        
        	
        }

}

