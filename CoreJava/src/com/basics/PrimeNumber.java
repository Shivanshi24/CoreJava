package com.basics;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 11;

		int count = 0;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				count++;

				System.out.println("not a prime number" + i);
				
				break;

				

			}

		}

		if (count == 0) {

			System.out.println("prime number");

		}

	}

}
