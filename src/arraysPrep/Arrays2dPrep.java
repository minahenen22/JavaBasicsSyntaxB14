package arraysPrep;

public class Arrays2dPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]num= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(num[0][1]);
		
		for(int i=0; i<num.length; i++) {
			System.out.println();
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
		}
		

	}

}
