package com.in28minutes.introduction;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(20);		
		System.out.println(ducati.getSpeed());
		
		honda.setSpeed(80);
	}
}