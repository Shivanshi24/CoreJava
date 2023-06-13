package com.ritiuals;

public class StringCharCount {

	public static void main(String[] args) {

		String[] s = { "radhika", "pallavi", "anamika", "ankita" };
		int count = 0;

		for (char x = 'a'; x <= 'z'; x++) {

			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < s[i].length(); j++) {

					if (s[i].charAt(j) == x) {
						count++;

					}

				}

			}
			if (count >= 0) {
				System.out.println("char " + x + " = " + count);
				count = 0;

			}

		}
	}

}
