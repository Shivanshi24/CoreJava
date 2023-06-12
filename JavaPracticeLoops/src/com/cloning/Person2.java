package com.cloning;

public class Person2 {
	
	private int id;
	private String name;
	private String address;
	
	public Person2() {
		
	}
	
	public Person2(int id, String name, String address) {
		System.out.println("three parm constr");
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public void getId() {
		System.out.println(id);
	}
	
	public void getName() {
		System.out.println(name);
	}
	public void getAddress() {
		System.out.println(address);
	}

}
