package com.ritiuals;

public class CharCount {

	public static void main(String[] args) {

		String[] s = { "shiv", "kanika", "nimish", "sikha" };
		int count = 0;
		char c = 'i';

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
