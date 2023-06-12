package com.abstr;

public class TestShape {
	
	public static void main(String[] args) {
		
		//Class with the help of abstract method;
		
          Rectangle r = new Rectangle();
		 Triangle t = new Triangle();
		 Circle c = new Circle();
		 
		r.setLength(10);
		r.setWidth(5);
		
		t.setBase(6);
		t.setHeight(4);
		
		c.setRadius(4);
		
		r.area();
		t.area();
		c.area();
		
		Shape s = new Rectangle();
		s.area();
		
		

	}

}
