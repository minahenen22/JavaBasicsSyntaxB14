package arraysPrep;

import java.util.Scanner;

public class Replit99 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
        char [] charArray= givenString.toCharArray();
        char value1;
        char value2 = 0;

        for (int i = 0; i < givenString.length(); i++) {
            value1 = charArray[i];
            value1++;

            for (int j = givenString.length() - 1; j == 0; j--) {
                value2 = charArray[j];
                value2++;
                
                    }
            if (value1==value2) {System.out.println("true");}
            else {
                System.out.println("false");
                }
            }

	}

}
