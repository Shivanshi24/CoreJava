package com.basics;

public class ArmstrongNumber01 {

	public static void main(String[] args) {

		int num = 301;
		int r;
		int sum = 0;
		int n = num;

		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;

		}

		if (num == sum) {
			System.out.println("armstrong number");
		}

		else {
			System.out.println("not an armstrong number");
		}

	}

}
