package com.cloning;

public class Employee extends Person2 {
	
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String address, String department) {
		
		//super() keyword;
		super(id, name, address );
		System.out.println("four param constr");
		this.department = department;
		
		
		}
	public void getDepartment() {
		System.out.println(department);
	}

}
