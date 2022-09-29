package replit35To45;

import java.util.Scanner;

public class Task36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String outcome;
		System.out.println("word1");
		String word1=scan.next();
		System.out.println("word2");
		String word2=scan.next();
		System.out.println("int1");
		int int1=scan.nextInt();
		System.out.println("int2");
		int int2=scan.nextInt();
		if (word1.equals("banana") && int1==int2) 
		outcome="AND";
		else if (word1.equals("banana") || int1==int2) 
		outcome="OR";
		else 
		outcome="NONE";
		System.out.println(outcome);

		}
		

	}


