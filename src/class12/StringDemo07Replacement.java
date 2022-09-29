package class12;

public class StringDemo07Replacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
        System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[1-9]", "X"));

	}

}
