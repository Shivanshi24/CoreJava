package com.basics;

public class Factorial {

	public static void main(String[] args) {
		
		int fact = 6;
		
		int sum = 1;
		
		for(int i = 1; i<=fact; i++) {
			
			sum = sum * i;
			
			
		}
		
		System.out.println(sum);
	}
	
}
