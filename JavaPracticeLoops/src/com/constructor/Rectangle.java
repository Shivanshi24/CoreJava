package com.constructor;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
		System.out.println(length);
		System.out.println(width);
		
	}
	
}