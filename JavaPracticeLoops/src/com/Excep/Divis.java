package com.Excep;

public class Divis {

	public static void main(String[] args) {

		try {

			String name = "name";

			System.out.println("Name is = " + name);
			int a = 12;
			int b = 0;

			int c = a / b;

			System.out.println("Division = " + c);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This block is catch block");
		}
		int a = 10; 
		int b = 2;
		int c = a + b;
		System.out.println("Add is = " + c);
	}

}
