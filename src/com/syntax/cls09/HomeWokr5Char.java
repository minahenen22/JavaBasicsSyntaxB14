package com.syntax.cls09;

public class HomeWokr5Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] symbol= {'A','B','C','D','E','F'};
		
		for ( int i=5;i<symbol.length;i--) {
			
			if (i<0)
			{break;}
			System.out.print(symbol[i]+" ");
		}
		
		System.out.println();
		for (int j=symbol.length -1; j>=0;j--) {
			System.out.print(symbol[j] + " ");
		}
		

	}

}
