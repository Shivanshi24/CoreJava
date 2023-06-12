package com.constructor;

public class Shape {

	private String color = null;
	private int borderwidth = 0;
	
	public Shape() {
		
	}
	public Shape(int bw, String c) {
		color = c;
		borderwidth = bw;
		System.out.println(color);
		System.out.println(borderwidth);
		
	}

	
}
