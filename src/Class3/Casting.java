package Class3;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting=> date type casting is converting 
		 * 
		 */
		byte box1=66;// smallest
		short box2= 3333;//slightly bigger
		int box3 = 456454;// bigger commonly used
		long box4 = 8798787987978l; // slightly larger box
		float box5 = 2.5f;// lager
		double box6 = 2.555656; //largest
		
		int number=(int)15.2;
		System.out.println(number);
		byte smallerBox= (byte)box2;
		System.out.println(smallerBox); 
		short biggerBox=box1;
		System.out.println(biggerBox);
		long box7=box1;
		char a=(char) box1;
		System.out.println(a);
		short newBox=box1;
		System.out.println(newBox);
		byte outBox=(byte) box2;
		System.out.println("*************"+"****************");
		System.out.println(outBox);
		
		

	}

}
