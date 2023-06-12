package com.abstr;

public class Triangle extends Shape {
	
	private int b;
	private int h;
	
public void setBase(int b) {
		
		this.b = b;
	}
	
	public int getBase() {
		return b;
		
	}
	
public void setHeight(int h) {
		
		this.h = h;
	}
	
	public int getHeight() {
		return h;
		
	}
	//Override;
	public void area() {
		int tr = getBase() * getHeight() / 2;
		System.out.println("Area of triangle = " + tr);

	}
	

}
