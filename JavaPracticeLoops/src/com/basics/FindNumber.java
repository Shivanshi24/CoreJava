package com.basics;

public class FindNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 40, 6, 8, 100, 99, 10 };

		int num = 40;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				index = i;

			}

		}
		System.out.println(index);
	}

}
