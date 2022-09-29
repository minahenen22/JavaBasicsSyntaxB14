package arraysPrep;

import java.util.Scanner;

public class Replit76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
	    int [] nums=new int[7];
	  for (int i=0;i<nums.length;i++){
	    System.out.println("Please enter day"+nums[i]+" of the week");
	    String [] days=new String [7];
	    System.out.println();
	    
	    
	    if (nums[i]==1){
	      System.out.println("Sunday");
	    }else if (nums[i]==2){
	      System.out.println("Monday");
	    }else if (nums[i]==3){
	      System.out.println("Tuesday");
	    }else if (nums[i]==4){
	      System.out.println("Wednesday");
	    }else if (nums[i]==5){
	      System.out.println("Thursday");
	    }else if (nums[i]==6){
	      System.out.println("Friday");
	    }else if (nums[i]==7){
	      System.out.println("Saturday");
	    }
	  }
	                               

	}

}
