package com.basics.polymorphis;

public class TestShape {
	
	public static void main(String[] args) {
		
		// inheritance with the help of constructor;
		
		Shape[]s = new Shape[3];
		
		s[0] = new Rectangle(30, 20);
		s[1] = new Triangle(20, 10);
		s[2] = new Circle(5.7);
		
	}

}
