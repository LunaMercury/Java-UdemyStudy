package section09;

public class MotorBike {

	private int speed;
	String state;

	public MotorBike() {
		this(5);
	}

	public MotorBike(int speed) {
		super();
		this.speed = speed;
	}

	public void start() {
		this.state = "started";
		System.out.printf("%s Bike Started", this).println();
		System.out.printf("speed : %d", this.speed).println();
	}

	public void addspeed(int speed) {
		if (this.speed + speed > 0) {
			setSpeed(speed);
		}

	}

	public int getSpeed() {
		System.out.println(this.speed);
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}

	}

	public String getState() {
		System.out.println(this.state);
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}