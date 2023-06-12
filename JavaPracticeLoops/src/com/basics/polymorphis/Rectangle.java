package com.basics.polymorphis;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
		int ar = l*w;
		System.out.println("Area of Rectangle is = "+ar);
		
		
	}

}
