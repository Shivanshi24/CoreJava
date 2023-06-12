package com.cloning;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person(20, "Shivanshi", "Indore");
		
		p.getId();
	    p.getName();
		p.getAddress();
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAddress());
	}

}
