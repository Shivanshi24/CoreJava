package com.ritiuals;

public class PavBhaji {

	public static void main(String[] args) {

		String[] s = { "ritika", "drishti", "surbhi", "aarushi", "nikhil" };

		char c = 'i';
		int count = 0;

		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == c) {
					count++;

				}

			}

		}
		System.out.println(count);
	}

}
