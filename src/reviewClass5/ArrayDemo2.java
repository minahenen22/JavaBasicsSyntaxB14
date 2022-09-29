package reviewClass5;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Break till 8:50
		int size=10;
	     
	        int [] arr=new int[10];

	        for(int i=0; i<arr.length;i++) {
	            arr[i]=size;
	            size++;
	        }

	        System.out.println(Arrays.toString(arr));
	        
	        System.out.println(Arrays.toString(arr));
	        System.out.println("**");
	        int sum=0;
	        for(int num:arr) {
	            //sum+=num;
	            sum=sum+num;
	        }
	        System.out.println(sum);

	    }

	    }

	


