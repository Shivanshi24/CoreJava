package com.python;

public class Churma {
	public static void main(String[] args) {
		int n = 86;
		int sum = 0;
		int i;
		for (i = 2; i < n; i++) {

			if (n % i == 0) {
				sum++;

			}

		}
		if (n == sum) {

			System.out.println("prime nuber");

		} else {

			System.out.println("not a prime number");
		}
	}

}
