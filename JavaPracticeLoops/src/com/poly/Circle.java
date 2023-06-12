package com.poly;

public class Circle extends Shape {
	
	private double radius;
	public static final double PI =3.14;
	
	
	
	public void setRadius(double radius) {
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() {
		double cr = PI * radius * radius;
		System.out.println("Area of circle = " + cr);
		return 0;
	}

}
