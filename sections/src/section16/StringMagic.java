package section16;

public class StringMagic {

	public int countUppercaseLetters(String str) {
		if (str == null) {
			return -1;
		}
		int numOfUpper = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				numOfUpper++;
			}
		}
		return numOfUpper;
	}

	public boolean hasConsecutiveDuplicates(String str) {
		if (str == null || str.trim() == "" || str.length() <= 1) {
			return false;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(i + 1)) {
				return true;
			}
		}
		return false;
	}

	public int getRightmostDigit(String str) {
		if (str == null || str.trim() == "") {
			System.out.println("null!");
			return -1;
		}
		int digit = -1;

		for (int i = str.length() - 1; i >= 0; i--) {
			Character check = str.charAt(i);
			if (Character.isDigit(check)) {
				digit = Character.getNumericValue(check);
				return digit;
			}
		}

		return digit;
	}

	public String findLongestWord(String sentence) {
		if (sentence == null || sentence.trim().isEmpty()) {
			return "";
		}
		
		String[] words = sentence.split(" ");
		String rs = words[0];
		for (int i = 0; i < words.length - 1; i++) {
			if (rs.length() < words[i + 1].length()) {
				rs = words[i+1];
			}
		}

		return rs;
	}

	public static void main(String[] args) {
		StringMagic stringMagic = new StringMagic();
//		int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
//		System.out.println(uppercaseLetters); // This will print 5

//		boolean countD = stringMagic.hasConsecutiveDuplicates("Hello WORLd");
//		System.out.println(countD);

//		int mostD = stringMagic.getRightmostDigit("1");
//		System.out.println(mostD);

		String longestWord = stringMagic.findLongestWord("Java is an object oriented programming language");
		System.out.println(longestWord);
	}

}
