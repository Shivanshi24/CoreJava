package com.basics;

public class ForLoop {
	public static void main(String[] args) {
		int i;

		int sum = 0;
		for (i = 200; i >= 100; i--) {

			if (i % 7 == 0) {
				sum = sum + i;
				System.out.println(i);
				System.out.println("sum = " + sum);

			}

		}
		System.out.println("sum = " + sum);
	}

}
