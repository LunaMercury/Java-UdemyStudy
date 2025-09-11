package section15;

public class NumberUtils {
	public int getLastDigit(int number) {
		int lastDigit = 0;

		if (number < 0) {
			return lastDigit = -1;
		}

		lastDigit = number % 10;

		return lastDigit;
	}

	public int getNumberOfDigits(int number) {
		int digitLong = -1;

		if (number < 0) {
			return digitLong;
		}
		if (number == 0) {
			return digitLong = 1;
		}

		digitLong = (int) Math.log10(number) + 1;

		return digitLong;
	}

	public int getSumOfDigits(int number) {
		int sum = 0;
		int num = number;

		if (number < 0) {
			return sum = -1;
		}

		while (num > 0) {
			int numb = num % 10;
			num = num / 10;
			sum = sum + numb;
		}

		return sum;
	}

	public int reverseNumber(int number) {
		int result = 0;
		if (number < 0) {
			return result = -1;
		}		

		while (number > 0) {
			result *= 10;
			int tip = number % 10;
			number = number / 10;
			result += tip;
		}

		return result;
	}

	public static void main(String[] args) {
		NumberUtils utils = new NumberUtils();

//		System.out.println(utils.getLastDigit(1234)); // Output: 4
//		System.out.println(utils.getLastDigit(90)); // Output: 0
//		System.out.println(utils.getLastDigit(9)); // Output: 9
//		System.out.println(utils.getLastDigit(0)); // Output: 0
//		System.out.println(utils.getLastDigit(-67)); // Output: -1

//		System.out.println(utils.getNumberOfDigits(12345)); // Output: 5
//		System.out.println(utils.getNumberOfDigits(90)); // Output: 2
//		System.out.println(utils.getNumberOfDigits(9)); // Output: 1
//		System.out.println(utils.getNumberOfDigits(0)); // Output: 1
//		System.out.println(utils.getNumberOfDigits(-67)); // Output: -1

//		System.out.println(utils.getSumOfDigits(123)); // Output: 6
//		System.out.println(utils.getSumOfDigits(90)); // Output: 9
//		System.out.println(utils.getSumOfDigits(5)); // Output: 5
//		System.out.println(utils.getSumOfDigits(0)); // Output: 0
//		System.out.println(utils.getSumOfDigits(-67)); // Output: -1

		System.out.println(utils.reverseNumber(123)); // 321
		System.out.println(utils.reverseNumber(5497)); // 7945
		System.out.println(utils.reverseNumber(-456)); // -1
		System.out.println(utils.reverseNumber(0)); // 0

	}
}
