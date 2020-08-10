package com.practice;

public class MotorCycle {
	private int Speed;
	MotorCycle(){
		this(5);
	}
	MotorCycle(int speed) {
		
		this.Speed = speed;
	}

public int getSpeed() {
	return Speed;
}
void setSpeed(int speed) {
if (speed>0) 

	this.Speed = speed;
	
}
public void increaseSpeed(int howMuch) {
	setSpeed(this.Speed + howMuch);
}
public void descreseSpeed(int howMuch) {
	setSpeed(this.Speed - howMuch)	;
}
	 void start() {
	System.out.println("Bike Started");	
		
	}

}
