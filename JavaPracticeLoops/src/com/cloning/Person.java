package com.cloning;

public class Person {
	
	private int id;
	private String name;
	private String address;
	
	public Person() {
		
		System.out.println("zero param constr");
		
	}
	
	public Person(int id) {
		this();
		
		System.out.println("one param constr");
		
	}
	
	public Person(int id, String name) {
		this(id);
		System.out.println("two param constr");
		
	}
	
	public Person(int id, String name, String address) {
		this(id, name);
		System.out.println("three param constr");
		this.id= id;
		this.name=name;
		this.address=address;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

}
