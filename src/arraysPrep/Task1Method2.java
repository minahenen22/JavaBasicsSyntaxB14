package arraysPrep;

import java.util.Scanner;

public class Task1Method2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] values = new int[5];
        for (int i = 0; i < values.length; i++) {
        System.out.println("please enter a number");
            values[i] = sc.nextInt();
        }
    for (int i=0; i<values.length; i++) {
     sum += values[i];
    }
    System.out.println(sum);
	}

}

