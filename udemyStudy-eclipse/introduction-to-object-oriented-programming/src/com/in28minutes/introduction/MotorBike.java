package com.in28minutes.introduction;

public class MotorBike {
	// state
	private int speed; // member variable. 객체에 소속된 해당 객체 고유의 것

	// behavior
	void start() {
		System.out.println("Bike Started");
	}

	// method
	void setSpeed(int speed) { // 이 speed는 지역 변수이다.
		this.speed = speed; //this.speed는 전역변수이다.
		System.out.printf("Speed is changed to %d\n", speed);
	}
	int getSpeed(){
		return this.speed;
	}

}