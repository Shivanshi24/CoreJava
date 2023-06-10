package com.basics;

public class ForLoop04 {

	public static void main(String[] args) {

		int i;
		int sum = 0;

		for (i = 50; i <= 200; i++) {
			if (i % 5 == 0) {
				sum = sum + i;

				System.out.println(i);
				System.out.println("sum = " + sum);

			}

		}
		System.out.println("sum = " + sum);
	}

}
