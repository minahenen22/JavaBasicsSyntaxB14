package groupProject01;

public class Task11 {

	public static void main(String[] args) {
// Write a program to print out duplicate elements from an Array of Strings?
		
		String [] names= {"Sam","Mike","Jeff","Sam"};
		for (int i=0;i<names.length;i++) {
			for (int j=i+1;j<names.length;j++) {
				if ( names[i] == names[j]){
					
					
					
					System.out.println(names[j]);}
			}
			
		}
		
		

	}

}
