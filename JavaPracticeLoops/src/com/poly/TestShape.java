package com.poly;

public class TestShape {
	
	public static void main(String[] args) {
		
		//created an array of type shape whose size is = 3;
	  
		Shape [] s = new Shape[3];
		//created objects of child class whose type is shape
		s[0] = new Rectangle();
		s[1]= new Triangle();
		s[2] = new Circle();
		
		//TypeCasting of rectangle, triangle & circle;
		
		Rectangle r = (Rectangle)s[0];
		Triangle t = (Triangle)s[1];
		Circle c= (Circle)s[2];
	
		//passes vale
		r.setLength(20);
		r.setWidth(30);
		
		c.setRadius(5);
		
		t.setBase(6);
		t.setHeight(8);
		
		for(int i = 0; i < s.length; i++) {
			s[i].area();
			
		}
	}
	

}
