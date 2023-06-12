package com.basics;

public class TypeCasting {

	public static void main(String[] args) {

		String s1 = "100";
		int a = Integer.parseInt(s1);
		String s2 = "200";
		int b = Integer.parseInt(s2);

		System.out.println(s1 + s2);
		System.out.println(a + b);

		String s3 = String.valueOf(a);
		System.out.println(a);

	}

}
