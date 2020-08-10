package com.practice;

public class MotorBikeRunner {
public static void main(String[] args) {
	MotorCycle ducati=new MotorCycle();
	MotorCycle honda=new MotorCycle();
	
	ducati.start();
	honda.start();

	ducati.setSpeed(100);
	System.out.println(ducati.getSpeed());
	honda.setSpeed(50);
	System.out.println(honda.getSpeed());
	

}
}
