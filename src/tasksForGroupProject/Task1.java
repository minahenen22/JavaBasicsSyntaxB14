package tasksForGroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan= new Scanner (System.in);
		
		
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int [] nums = new int[size];
		
		for (int i=0;i<size;i++) {
			System.out.println("Please enter a number");
			nums [i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		int sum=0;
		for (int num:nums) {
			sum+=num;
		}
		System.out.println(sum);
		

	}

}
