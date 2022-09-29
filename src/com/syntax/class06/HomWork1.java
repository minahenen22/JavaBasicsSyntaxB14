package com.syntax.class06;

import java.util.Scanner;

public class HomWork1 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("What is your country?");
	String country=scan.nextLine();
	String language;
	switch (country.toLowerCase()){// .toLowerCase  .toUpperCase
	case "USA":
		language="English";
		break;
	case "Egypt":
		language ="Arabic";
		break;
	case "Italy":
		language="Italian";
		break;
	case "UK":
		language="English";
	case "Spain":
		language="Spanish";
		break;
	case "Thailand":
		language="Thai";
		break;

	default:
			language="Unknow";
			
	}
			System.out.println("the language of "+country+" is "+ language);
		
			
	
	
	
}
}
