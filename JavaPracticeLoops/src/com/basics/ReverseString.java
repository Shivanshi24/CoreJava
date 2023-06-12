package com.basics;

public class ReverseString {

	public static void main(String[] args) {

		String[] names = { "core java" };

		for (int i = 0; i < names.length; i++) {

			for (int j = names[i].length() - 1; j >= 0; j--) {

				System.out.println(names[i].charAt(j));

			}

			System.out.print(" ");
		}

	}

}
