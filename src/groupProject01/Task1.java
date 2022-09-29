package groupProject01;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter how many numbers");
		int size=scan.nextInt();
		int [] array=new int [size];
		for (int i=0;i<size;i++) {
			System.out.println("Enter each number");
			array[i]=scan.nextInt();
		}
		scan.close();
		int sum=0;
		for (int i=0;i<array.length;i++) {
			sum+=i;
			
			
		}System.out.println(sum);
		
		
		
		
	}

}
