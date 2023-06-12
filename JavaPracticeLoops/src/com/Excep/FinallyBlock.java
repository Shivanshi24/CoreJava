package com.Excep;

public class FinallyBlock {

	public static void main(String[] args) {

		try {

			System.out.println(1);

			int a = 10 / 2;

			System.out.println(2);

			System.exit(0);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(3);
		}

		finally {
			System.out.println(4);
		}
	}

}
