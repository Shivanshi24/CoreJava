package com.Excep;

public class TestClass {
	
	public static void main(String[] args) {
		dad();
			}
	
	public static void dad() {
		
		System.out.println("in dad");
		try {
			mom();
		} catch (AajBachGaya e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void mom() throws AajBachGaya  {
		
		System.out.println("in mom");
		son();
	}
	
	public static void son() throws AajBachGaya  {
		
		System.out.println("in son");
		throw new AajBachGaya();
	}

}
