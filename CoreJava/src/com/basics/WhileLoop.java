package com.basics;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			System.out.println("i = " + i);
			sum = sum + i;
			System.out.println("sum = " + sum);
			i++;
		}
		System.out.println("sum = " + sum);
	}

}
