package com.basics;

public class BhimaShankar {
	public static void main(String[] args) {
		int num = 597;
		int r;
		int sum = 0;
		int n = num;
		while (n > 0) {
			r = n % 10;
			sum = r + (sum * 10);
			n = n / 10;

		}
		System.out.println(sum);
	}

}
