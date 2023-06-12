package com.basics;

public class SecondLargest02 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 60, 80, 90 };

		int a = 0;
		int b = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > b) {
				a = b;
				b = arr[i];

			}

		}
		System.out.println(a);
	}

}
