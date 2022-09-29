package arraysPrep;

import java.util.Scanner;

public class Replit102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    String word2="";

	    for (int i=1 ;i<word.length();i++){
	      if (word.charAt(i)==word.charAt(i-1)){
	        
	        continue;
	      }word2 = word2+word.charAt(i);
	        
	        
	        
	    }System.out.print(word.charAt(0)+word2);
	    
	   

	}

}
