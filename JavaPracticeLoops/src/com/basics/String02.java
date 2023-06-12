package com.basics;

public class String02 {

	public static void main(String[] args) {

		String s = "core java";

		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length(); j++) {

				System.out.println(arr[i].charAt(j));

			}

			System.out.println();

		}
	}

}
