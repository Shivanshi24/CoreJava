package com.basics;

public class FindNumberFromArray {

	public static void main(String[] args) {

		int arr[] = { 20, 30, 40, 50, 60, 70, 80 };

		int num[] = { 20, 30, 50, 60, 70, 80 };
		int index = 0;
		int i, j;

		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < num.length; j++) {

				if (arr[i] == num[j]) {
					index = 1;

				}
			}

			if (index == 1) {
				index = 0;
			} else {
				System.out.println(arr[i]);
			}

		}

	}

}
