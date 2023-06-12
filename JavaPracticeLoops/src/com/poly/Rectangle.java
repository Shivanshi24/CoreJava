package com.poly;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length = length;
		
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
		
	}
	
	public int getWidth() {
		return width;
	

}
	
	public double area() {
		int ar = getLength() * width;
		System.out.println("Area of rectangle = " + ar);
		return 0;
	}

}
