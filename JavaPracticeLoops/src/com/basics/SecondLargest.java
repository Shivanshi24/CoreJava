package com.basics;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 100, 1, 2, 4, 6, 8, 90, 12 };

		int a = 0;
		int b = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > b) {

				a = b;
				b = arr[i];
			}

			if (a < arr[i] && b > arr[i]) {

				a = arr[i];

			}

		}

		System.out.print(a);

	}

}
