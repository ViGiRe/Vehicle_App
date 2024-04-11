package com.app;

public class Car extends Vehicle{
	
	private int wheels;
	private String type;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGears;
	
	public Car(String name,int wheels,String type,int doors,int gears,boolean isManual,int currentGears) {
		super(name);
		this.type = type;
		this.doors = doors;
		this.wheels = wheels;
		this.gears = gears;
		this.isManual = isManual;
		currentGears = 1;
	}
	
	public void changeGears(int newGear) {
		this.currentGears = newGear;
		System.out.println("Current Gear Method Called: Changed to : "+this.currentGears+" gear");
	}
	
	public void changeSpeed(int newSpeed,int newDirection) {
		move(newSpeed, newDirection);
		System.out.println("change Speed Method called: Speed : "+newSpeed+" direction "+newDirection);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getCurrentGears() {
		return currentGears;
	}

	public void setCurrentGears(int currentGears) {
		this.currentGears = currentGears;
	}
	
	
}
