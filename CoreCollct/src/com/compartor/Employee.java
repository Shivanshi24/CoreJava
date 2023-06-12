package com.compartor;

import java.util.*;
public class Employee implements Comparator<Employee>{

	public int id;
	String name;
	String address;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String address) {
		this.id = id; 
		this.name = name;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +" "+name+" "+address;
	}

	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.id-o2.id;
		
	}
	
}
