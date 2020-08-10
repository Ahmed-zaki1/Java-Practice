package com.practice;

public class MotorBikeRunner {
public static void main(String[] args) {
	MotorCycle ducati=new MotorCycle(200);
	MotorCycle honda=new MotorCycle(100);
MotorCycle SomethingElse = new MotorCycle();
	System.out.println(ducati.getSpeed());
	System.out.println(honda.getSpeed());
	System.out.println(SomethingElse.getSpeed());

	ducati.start();
	honda.start();

	ducati.setSpeed(100);
	
	ducati.increaseSpeed(100);
	honda.increaseSpeed(100);
	
	ducati.descreseSpeed(50);
	honda.descreseSpeed(99);
		/*
		 *  int ducatiSpeed = ducati.getSpeed(); ducatiSpeed =
		 * ducatiSpeed + 100; ducati.setSpeed(ducatiSpeed);
		 * 
		 * int hondaSpeed = honda.getSpeed(); hondaSpeed = hondaSpeed + 100;
		 * honda.setSpeed(hondaSpeed);
		 */
	
	System.out.println(ducati.getSpeed());
	System.out.println(honda.getSpeed());

}
}
