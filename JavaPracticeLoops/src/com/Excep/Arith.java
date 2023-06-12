package com.Excep;

public class Arith {
	public static void main(String[] args) {
		try {
			String name = "name";
			System.out.println("Name is = " + name);
			int a = 10;
			int b = 0;
			
			int c = a/b;
			
			
			System.out.println("Divion is = " + c);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is catch block");
		}
	}

}
