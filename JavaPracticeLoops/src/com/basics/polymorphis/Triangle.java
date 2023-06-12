package com.basics.polymorphis;

public class Triangle extends Shape{
	private int base;
	private int height;
	
public Triangle() {
		
	}
	
	public Triangle(int b, int h) {
		base = b;
		height = h;
		int ar = (b * h)/ 2;
		System.out.println("Area of Triangle = " + ar);
	
		
	}


	}



