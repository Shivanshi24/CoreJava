package com.basics;

public class SuperStar {
	public static void main(String[] args) {
		int i;
		int sum = 0;

		for (i = 100; i <= 200; i++) {
			if (i % 5 == 0) {
				sum = sum + i;

				System.out.println(i);
				System.out.println("sum = " + sum);

			}

		}
		System.out.println(sum);
	}

}
