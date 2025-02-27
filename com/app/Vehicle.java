package com.app;

public class Vehicle {

	private String name;
	private int currentSpeed;
	private int currentDirection;
	
	public Vehicle(String name) {
		super();
		this.name = name;
		this.currentSpeed = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Steer Method called : Steering at"+currentDirection+" degrees.");
	}
	
	public void move(int Speed,int Direction) {
		currentSpeed = Speed;
		currentDirection = Direction;
		System.out.println("Move Method Called : Moving at "+currentSpeed+" in direction "+ currentDirection);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	public void stop() {
		this.currentSpeed = 0;
		System.out.println("Vehicle Stopped");
	}
}
