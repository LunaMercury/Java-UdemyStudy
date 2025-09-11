package section11;

public class MyChar {

	private char MyC;

	public MyChar(char myC) {
		this.MyC = myC;
	}

	public boolean isVowel() {
		if (MyC == 'a') {
			return true;
		}

		return false;
	}

	public int isDigit() {
		int number = (int) MyC;
		return number;
	}

	public boolean isAlphabet() {
		if (MyC >= 97 && MyC <= 122) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		System.out.println();
		
	}

	public static void printUpperCaseAlphabets() {
	}
}