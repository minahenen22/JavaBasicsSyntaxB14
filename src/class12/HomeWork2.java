package class12;

import java.util.Arrays;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day= "sunday";
		char [] array=day.toCharArray();
		System.out.println(Arrays.toString(array));
		
		
		for (int i=day.length()-1; i>=0;i--) {
			System.out.print(array[i]+ " ");
			
		}
		System.out.println();
		for (int i=0;i<day.length();i++) {
			System.out.print(day.charAt(i)+ " ");

	}

}
}
