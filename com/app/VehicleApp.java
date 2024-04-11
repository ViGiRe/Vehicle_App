package com.app;

public class VehicleApp {
	
	public static void main(String[] args) {
		SUV suv = new SUV("Fortuner", 5, false);
		suv.move(60, 0);
		suv.accelerate(-30);
		System.out.println("Current Gear: "+suv.getCurrentGears());
	}

}
