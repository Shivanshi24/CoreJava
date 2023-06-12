package com.oops;

public class Automobiles {
	
	private String colour = null;
	private String make = null;
	private int speed = 0;
	private static final int NO_OF_GEARS = 4;
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getcolour() {
		return colour;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	public void changeGear(int gear) {
		System.out.println("gear changed to " + gear);
	}
	
	public void setSpeed(int speed) {
		this.speed= speed;
		
	}
	
	public void getSpeed(int s) {
		System.out.println("speed is =" + s);
		
	}
	public void accelerator(int sp) {
		int total = speed + sp;
		System.out.println("now the speed is = " + total);
	}
	
	public void brake(int sp) {
		int total = speed - sp;
		System.out.println("now the speed is = " + total);
	}

}
