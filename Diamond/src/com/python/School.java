package com.python;

public class School {
	public static void main(String[] args) {
		int num = 678;
		int r;
		int n = num;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = r + (sum * 10);
			n = n / 10;

		}
		System.out.println(sum);

	}

}
