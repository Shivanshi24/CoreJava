package com.oops;

import java.util.*;

public class Person {
	private String name = null;
	private Date dob;
	private String address = null;
	public static final int AVG_AGE = 18;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public String getAddress() {
		return address;
	}
	

	public void setDate( Date dob) {
		this.dob = dob;
	}
	
	public Date getDate() {
		return dob;
	}
	
	public int getAge(int age) {
		return age;
		
		
}
}
