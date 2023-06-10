package com.basics;

public class Array2 {

	public static void main(String[] args) {

		int[] i = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		int sum = 0;

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);
			sum = sum + i[j];

		}

		System.out.println("total = " + sum);

	}

}
