package section22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<String> words1 = List.of("Apple", "Bat", "Cat");
		List<String> words2 = List.of("rum","jinger");
		List<String> words3 = List.of("hot sauce","vanilla");
		
		List<String> margedList = new ArrayList<>();
		margedList.addAll(words1);
		margedList.addAll(words2);
		margedList.addAll(words3);
		System.out.println(margedList.toString());
		
		List<String> words11 = new ArrayList<>(words1);
		Iterator<String> itrator = words11.iterator();
		while (itrator.hasNext()) {
			if (itrator.next().endsWith("t")) {
				itrator.remove();
			}
		}
		System.out.println(words11.toString());
	}
}
