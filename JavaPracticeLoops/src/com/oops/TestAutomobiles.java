package com.oops;

public class TestAutomobiles {
	
	public static void main(String[] args) {
		
		Automobiles ac = new Automobiles();
		
	  ac.setColour("white");
		System.out.println(ac.getcolour());
		
		ac.setMake("Seat Cover");
		System.out.println(ac.getMake());
		
		ac.changeGear(2);
		ac.setSpeed(200);
		ac.accelerator(5);
		ac.brake(6);
		
	}
	

}
