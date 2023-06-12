package com.abstr;

public class Circle extends Shape {
	
	private double radius;
	public static final double PI =3.14;
	
	
	
	public void setRadius(double radius) {
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	

	@Override
	public void area() {
		double cr = PI * getRadius() * getRadius();
		System.out.println("Area of circle = " + cr);

		
	}

}
