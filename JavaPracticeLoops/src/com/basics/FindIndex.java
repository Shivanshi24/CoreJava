package com.basics;

public class FindIndex {

	public static void main(String[] args) {

		int arr[] = { 20, 30, 40, 50, 60, 70, 80 };

		int num = 60;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				index = i;

			}

		}
		System.out.println(index);

	}

}
