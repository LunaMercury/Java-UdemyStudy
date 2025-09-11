package section11;

public class BiNumber {
	private int number1;
	private int number2;

	public BiNumber() {
		super();
	}

	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int add() {
		int addResult = number1 + number2;
		return addResult;
	}

	public int multiply() {
		int multiplyResult = number1 * number2;
		return multiplyResult;
	}

	public void doubleValue() {
		this.number1 *= 2;
		this.number2 *= 2;
	}

//	Getter, Setter
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

}
