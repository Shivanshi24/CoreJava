package com.basics;

public class Array {

	public static void main(String[] args) {

		int[] i = { 100, 200, 300, 140, 550, 660, 700, 880, 990, 1000 };

		int sum = 0;

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);
			sum = sum + i[j];

		}

		System.out.println("total =" + sum);

	}

}
