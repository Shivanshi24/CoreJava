package com.python;

public class Armstrong3 {

	public static void main(String[] args) {
		int num = 599;
		int r;
		int sum = 0;
		int n = num;
		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (num == sum) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");
		}
	}

}
