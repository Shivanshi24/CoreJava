package com.collctn;

public class Student {
	
	public int id;
	public String name;
	public String address;
	
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return id+" "+name+" "+address;
	}

}
