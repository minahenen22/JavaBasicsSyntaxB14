package com.syntax.cls09;

public class HomeWorkTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int z = 0; z <= 2; z++) {
			
            for (int x = 0; x <= 9; x++) {
            	if (z==2 && x>3) {
            		break;
            	}
                for (int c = 0; c <= 5; c++) {
                	
                    for (int v = 0; v <= 9; v++) {
                    	

                        System.out.println(z+"" + ""+x + ":" + c +""+ v );
                    }
                }
            }
        }

	}

}
