package section19;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

	public List<Integer> determineAllFactors(int number) {
		List<Integer> CDList = new ArrayList<>();

		if (number < 1) {
			return new ArrayList<>();
		}
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				CDList.add(i);
			}
		}
		return CDList;
	}

	public List<Integer> determineMultiples(int number, int limit) {
		List<Integer> multiples = new ArrayList<>();

		if (number > limit) {
			return new ArrayList<>();
		}

		for (int i = 1; number * i <= limit; i++) {
			multiples.add(number * i);
		}
		return multiples;
	}

	public static void main(String[] args) {
		NumberMagic nm = new NumberMagic();
		System.out.println(nm.determineAllFactors(6)); // Prints: [1, 2, 3, 6]

		NumberMagic nm2 = new NumberMagic();
		System.out.println(nm2.determineAllFactors(12)); // Prints: [1, 2, 3, 4, 6, 12]
		System.out.println(nm2.determineAllFactors(15)); // Prints: [1, 3, 5, 15]
		
		//
		NumberMagic nm3 = new NumberMagic();
		System.out.println(nm3.determineMultiples(5	, 21));
		System.out.println(nm3.determineMultiples(5	, 1));
	}

}
