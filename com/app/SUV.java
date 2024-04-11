package com.app;

public class SUV extends Car{

	public SUV(String name, int gears, boolean isManual) {
		super(name, 4, "SUV", 5, 6, true,7);
		// TODO Auto-generated constructor stub
	}

	
	public void accelerate(int rate) {
		int newSpeed = getCurrentSpeed() + rate;
		
		/*speed = 0 , gear = 1
		speed = 0 -10 , gear = 1
		speed = 10 -20 , gear = 2
		speed = 20 -30 , gear = 3
		speed = 30 -50 , gear = 4
		speed = 50 -70 , gear = 5
		above 70 = 6
		*/
		
		if (newSpeed == 0) {
			stop();
			changeGears(1);
		}
		else if (newSpeed > 0 && newSpeed <= 10) {
			changeGears(1);
		}
		else if (newSpeed > 10 && newSpeed <= 20) {
			changeGears(2);
		}
		else if (newSpeed > 20 && newSpeed <= 30) {
			changeGears(3);
		}
		else if (newSpeed > 30 && newSpeed <= 50) {
			changeGears(4);
		}
		else if (newSpeed > 50 && newSpeed <= 70) {
			changeGears(5);
		}
		else {
			changeGears(6);
		}
		
		if (newSpeed > 0) {
			changeSpeed(newSpeed, getCurrentDirection());
		}
	}
}
