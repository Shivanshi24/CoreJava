package com.inheritence;

public class TestShape {
	
	public static void main(String[] args) {
		
		//inheritance with the help of getter setter method;
		
	
	Shape s = new Shape();
	Rectangle r = new Rectangle();
	Circle c = new Circle();
	Triangle t = new Triangle();
	
	//Shape
	s.setColor("Red");
	System.out.println(s.getColor());
	s.setBorderWidth(100);
	System.out.println(s.getBorderWidth());
	System.out.println();
	
	//Rectangle
	r.setColor("Pink");
	System.out.println(r.getColor());
	r.setBorderWidth(50);
	System.out.println(r.getBorderWidth());
	r.setLength(20);
	System.out.println(r.getLength());
	r.setWidth(7);
	System.out.println(r.getWidth());
	System.out.println();
	
	//Circle
	c.setColor("Green");
	System.out.println(c.getColor());
	c.setBorderWidth(18);
	System.out.println(c.getBorderWidth());
	c.setRadius(13.5);
	System.out.println(c.getRadius());
	System.out.println();
	
	//Triangle
	t.setColor("Brown");
	System.out.println(t.getColor());
	t.setBorderWidth(14);
	System.out.println(t.getBorderWidth());
	t.setBase(5);
	System.out.println(t.getBase());
	t.setHeight(12);
	System.out.println(t.getHeight());
	System.out.println();

    }
	
	
}