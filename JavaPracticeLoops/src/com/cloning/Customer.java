package com.cloning;

public class Customer implements Cloneable {
	
	private String name = null;
	public Account account = null;


	public Customer(String name) {
		
		this.name=name;
		this.account = new Account(100);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//overriding clone method;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;

	}
    

}
