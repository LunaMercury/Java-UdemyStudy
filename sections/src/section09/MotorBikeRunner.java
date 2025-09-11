package section09;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(80);

		ducati.start();
		honda.start();

		int ducatispeed = ducati.getSpeed();
		ducatispeed += 100;
		ducati.setSpeed(ducatispeed);
		
		ducati.addspeed(100);		

//		honda.setSpeed(50);

		ducati.getSpeed();
//		honda.getSpeed();
		
		System.out.println(50.0/12);
		System.out.println(50%12);
	}
}