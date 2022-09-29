package arraysPrep;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scan=new Scanner(System.in);
		 
		String [] countries=new String[5];
		System.out.println("Enter one of these countries: USA, Egypt,France,Germany,Japan");
		for (int i=0;i<countries.length;i++) {
			countries[i]=scan.next();
			if (countries[i] .equals ("USA")) {
				System.out.println("The capital of "+countries[i]+" is Washington");
			}else if (countries[i] .equals("Egypt")) {
				System.out.println("The capital of "+countries[i]+" is Cairo");
			}else if (countries[i] .equals("France")) {
				System.out.println("The capital of "+countries[i]+" is Paris");
			}else if (countries[i] .equals("Germany")) {
				System.out.println("The capital of "+countries[i]+" is Berlin");
			}else if (countries[i] .equals("Japan")) {
				System.out.println("The capital of "+countries[i]+" is Tokyo");
			}else {
				System.out.println("Enter one of the above countries");
			}
	
			System.out.println("***********************************");
			
			System.out.println("Enter one of these countries: USA, Egypt,France,Germany,Japan");
			
			for (String  country:countries) {
				countries[i]=scan.next();
					if (countries[i] .equals ("USA")) {
						System.out.println("The capital of "+countries[i]+" is Washington");
					}else if (countries[i] .equals("Egypt")) {
						System.out.println("The capital of "+countries[i]+" is Cairo");
					}else if (countries[i] .equals("France")) {
						System.out.println("The capital of "+countries[i]+" is Paris");
					}else if (countries[i] .equals("Germany")) {
						System.out.println("The capital of "+countries[i]+" is Berlin");
					}else if (countries[i] .equals("Japan")) {
						System.out.println("The capital of "+countries[i]+" is Tokyo");
					}else {
						System.out.println("Enter one of the above countries");
					
				}
			}
			
			
			
			
		}
		
		
		

	}

}
