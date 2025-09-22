package section20;

public class DummyAlgorithm implements ComplexAlgorithm {

	@Override
	public int complexAlgorithm(int number1, int number2) {
		return number1 + number2;
	}

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new DummyAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}
}