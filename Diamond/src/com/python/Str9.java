package com.python;

public class Str9 {
	
	public static void main(String[] args) {

		String s = "deen dayal sharma";

		int count = 0;

		for (char x = 'a'; x <= 'z'; x++) {

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == x) {
					count++;
				}

			}

			if (count >= 0) {
				System.out.println("char " + x + " = " + count);
				count = 0;
			}

		}

	}

}
