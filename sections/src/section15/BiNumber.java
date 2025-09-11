package section15;

public class BiNumber {
	private int number1;
	private int number2;

	public int calculateLCM() {

		if (number1 < 0 || number2 < 0) {
			return -1;
		}

		if (number1 == 0 || number2 == 0) {
			return 0;
		}

		int big = 0;
		int small = 0;
		if (number1 > number2) {
			big = number1;
			small = number2;
		} else {
			big = number2;
			small = number1;
		}

		int i = 1;
		while (true) {
			int multiple = big * i;
			if (multiple % small == 0) {
				return multiple;
			}
			i++;
		}

	}

	public int calculateGCD() {
		if (number1 < 0 || number2 < 0) {
			return 1;
		}

		if (number1 == 0 || number2 == 0) {
			return 0;
		}

		int big = Math.max(number1, number2);
		int small = Math.min(number1, number2);
		int remainder;
		
		while (small != 0) {
			remainder = big % small;
			big = small;
			small = remainder;
		}
		
		return big;

	}

	public BiNumber() {
		super();
	}

	public BiNumber(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "BiNumber [number1=" + number1 + ", number2=" + number2 + "]";
	}

	public static void main(String[] args) {
//		BiNumber num = new BiNumber(55, 45);
//		System.out.println(num.calculateLCM());

		BiNumber binum = new BiNumber(48, 18);
		System.out.println(binum.calculateGCD()); // Output: 6

		binum = new BiNumber(0, 5);
		System.out.println(binum.calculateGCD()); // Output: 0

		binum = new BiNumber(-4, 2);
		System.out.println(binum.calculateGCD()); // Output: 1
	}

}
