package javaClass4;

import java.util.Scanner;

public class InputFromKeyBoard {

	public static void main(String[] args) {
		
		//scanner is a class helps to input from keyborad 
		Scanner input= new Scanner (System.in);
		System.out.println("please ener your name");
		String name=input.next();
		System.out.println(name);

	}

}
