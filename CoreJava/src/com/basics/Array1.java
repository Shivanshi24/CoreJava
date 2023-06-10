package com.basics;

public class Array1 {

	public static void main(String[] args) {

		int[] i = { 10, 22, 34, 45, 56, 67, 78, 89, 99, 100 };

		for (int j = i.length - 1; j >= 0; j--) {

			System.out.println("i ke " + j + " index ki value = " + i[j]);

		}
	}

}
