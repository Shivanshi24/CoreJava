package com.basics.polymorphis;

public class Circle extends Shape {

private double radius;
public static final double PI =3.14;
	
	public Circle() {
		
	}
	
   public Circle(double r) {
	   double ar = PI * radius * radius;
	   System.out.println("Area of circle = " + ar);
	  

}
}