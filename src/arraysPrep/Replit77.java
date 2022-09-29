package arraysPrep;

import java.util.Scanner;

public class Replit77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
		    

		    int [] nums=new int [5];
		    for (int i=0;i<nums.length;i++){
		      System.out.println("Input:");
		      nums[i]=scan.nextInt();
		      
		    }
		    for (int i=4;i<nums.length;i--){
		      if (nums[i]<0){
		    	  
		        break;
		      }System.out.println(nums[i]); 
		     
		    }
		    

	}

}
