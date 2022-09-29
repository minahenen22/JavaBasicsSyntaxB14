package class12;

public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Olena";
        String lastName="Dudka";
        System.out.println(firstName+lastName); // Mostly this is used
        System.out.println(firstName.concat(" ").concat(lastName));
        String str = " ";
        System.out.println(str.isEmpty());
        // str.isBlank() not avaialble in current version
        
        //removing spaces but it will ignore spaces in between a sentence
        String sentence= "  i love java";
        System.out.println(sentence);
        System.out.println(sentence.trim());
        
        String str2="Java is Very easy";//V caps letter
        /* * startsWith=> checks if a String starts with a specific letter or word
         * endsWith=> checks if a String Ends with a specific letter or word
         * contains=> checks if a String Contains a specific letter or word
         * 
         */
        System.out.println(str2.startsWith("Java"));
        System.out.println(str2.endsWith("y"));
        System.out.println(str2.contains("very"));
        
        // Method chaining helps us call multiple methods on 
        //a single line one method after an other
        System.out.println(str2.toLowerCase().contains("very"));
        
    

	}

}
