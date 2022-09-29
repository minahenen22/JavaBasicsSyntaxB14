package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		/*ask user where is from
		 * based on country  > define favorite food
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Where are you from?");
		String country=scan.nextLine();
		String favoriteFood;
		switch (country) {
		
		case "usa":
			favoriteFood="burgers and fries";
			break;
		case "Kazakhstan":
			favoriteFood="beshparmak";
			break;
		case "Turkey":
		favoriteFood="adan kebab";
		break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;
		case "India":
			favoriteFood="bryani";
			break;
			default:
				favoriteFood="Unknown";
				break;
			
		}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);

	}

}
