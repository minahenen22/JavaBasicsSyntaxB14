package javaClass4;

public class NestedIf {

	public static void main(String[] args) {
		int time=5;
		String day="Monday";
		if (day.equals("Monday")) {// its called outer if condition STRING is NON_PRIMITIVE we have to use .equals
			
			if (time>7) {System.out.println("go to work");}// inner door
			if (time<6) {
				System.out.println("lets sleep");
			}
		}
		System.out.println("**************************************************");
		double money=100000;
		String season="spring";
		
		if(season.equals("spring")) {
			if(money>30000) {
				
				System.out.println("lets have a vac");
			}
			else {System.out.println("will save more");}
			
			
		

	}
	}
}
