package com.ritiuals;

public class Noodles {

	public static void main(String[] args) {

		int[] a = { 10, 20, 10, 32, 10, 10, 42, 10, 45, 10, 60, 10 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 10) {
				count++;

			}

		}
		System.out.println(count);
	}

}
