package arraysPrep;

public class Array2DPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][]countries= { 
				{"Usa","Canada"},
				{"Peru","Ecuador","Panama"},
				{"Egypt","lybia","Tunisia","Morroco"},
				{"Thailand","India","Pakistan","China"}
			    };
		for (int i=0;i<countries.length;i++) {
			
		for (int j=0;j<countries[i].length;j++) {
			System.out.print(countries[i][j]+" ");
		}System.out.println();

	}
		
		System.out.println("               **********************");
		
		for (String[]country:countries) {
			for (String c:country) {
				System.out.print(c+" ");
			}System.out.println();
		}
	}
}
