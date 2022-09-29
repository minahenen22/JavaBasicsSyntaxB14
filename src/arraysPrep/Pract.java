package arraysPrep;

public class Pract {
	public static void main(String[] args) {
		
		int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		       sum = sum + array_variable[i][j];

		   }

		}

		System.out.println(sum / 5);
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		}
	}


