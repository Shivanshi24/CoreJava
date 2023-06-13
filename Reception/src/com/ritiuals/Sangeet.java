package com.ritiuals;

public class Sangeet {

	public static void main(String[] args) {

		String[] s = { "harsh", "paras", "aman", "ansh", "ruhan", "aarav" };

		char c = 'r';

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
