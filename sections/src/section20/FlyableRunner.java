package section20;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("with wing");
	}

}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("with fuel");
	}
}

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable flyable : flyingObjects) {
			flyable.fly();
		}
	}
}
