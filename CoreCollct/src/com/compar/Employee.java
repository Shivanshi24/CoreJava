package com.compar;

import java.lang.*;
public class Employee implements Comparable<Employee>{
	public int id;
	public String name;
	public String address;
	
	public Employee(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	
	
	@Override
	public String toString() {
		return id+" "+name+" "+ address;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.id == o.id) {
	
			return this.name.compareTo(o.name);
		}
		return this.id - o.id;
	}
	
	

}
