package class12;

public class HomeWork1 {
	public static void main(String[] args) {
		/*
		 * create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters,
 print the character in the middle of the String.

		 */
		String name= "I'm trying to learn Java";
		System.out.println(name.length());
		int num=name.length();
		
		if (!name.isEmpty()) {
			if(name.length()%2==0 && name.length()>3);
			System.out.println(name.substring(num/2,num));
			System.out.println(name.charAt(name.length()/2));
			
		}else {System.out.println("The string is empty");}

		//Asghar method
		
		String str="hello";
	    int length=str.length();
	    if(!str.isEmpty()&&length%2!=0&&length>=3) {

	        int middleIndex=length/2;
	        System.out.println(str.charAt(middleIndex));


	    }
	}
}
