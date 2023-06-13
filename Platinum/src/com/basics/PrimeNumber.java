package com.basics;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 61;
		int i;
		int count = 0;

		for (i = 2; i < num; i++) {

			if (num % i == 0) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println("prime number");

		} else {
			System.out.println("not a prime numberr");
		}

	}

}
