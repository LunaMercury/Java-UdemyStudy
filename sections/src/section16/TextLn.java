package section16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextLn {
	String str;

	public void lnMake(String text) {
		String[] words = text.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
	}

	public Integer[] searchOf(String target) {
		String str = this.str;
		List<Integer> indexList = new ArrayList<>();
		int fromIndex = 0;
		
		while (true) {
			int foundIndex = str.indexOf(target,fromIndex);
			if (foundIndex == -1) {
				break;
			}
			
			indexList.add(foundIndex);
			fromIndex = foundIndex + 1;
		}
		return indexList.toArray(new Integer[0]);
	}



	@Override
	public String toString() {
		return "TextLn [str=" + str + "]";
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public TextLn(String str) {
		super();
		this.str = str;
	}

	public TextLn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String someString = "This is a lot of text again";
		TextLn text = new TextLn(someString);
//		text.lnMake(someString);
		
		Integer[] result = text.searchOf("is");
		

		System.out.println(Arrays.toString(result));
	}

}
