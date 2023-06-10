package com.basics;

public class Array3 {

	public static void main(String[] args) {

		int[] i = { 100, 200, 360, 450, 560, 680, 760, 890, 990, 1000 };
		int sum = 0;

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);
			sum = sum + i[j];

		}
		System.out.println("total = " + sum);

	}

}
