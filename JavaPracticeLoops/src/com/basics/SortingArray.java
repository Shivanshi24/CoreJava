package com.basics;

public class SortingArray {

	public static void main(String[] args) {

		int[] arr = { 1, 11, 40, 8, 100, 99, 999 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		System.out.print("Asc = ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + ", ");

		}

	 System.out.println();

		System.out.print("Desc = ");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + ", ");

		}

	}

}
