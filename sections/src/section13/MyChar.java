package section13;

public class MyChar {	
    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {    	

        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
        case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' : {
        	return true;
        	}
        
        default:
        	return false;
        }
    }

    
    public static void main(String[] args) {
    	MyChar myChar = new MyChar();
    	 
    	System.out.println(myChar.isVowel('A'));  // Output: true
    	System.out.println(myChar.isVowel('b'));  // Output: false
    	System.out.println(myChar.isVowel('E'));  // Output: true
    	System.out.println(myChar.isVowel('f'));  // Output: false
	}

}
