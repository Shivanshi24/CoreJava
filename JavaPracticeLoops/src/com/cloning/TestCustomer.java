package com.cloning;

public class TestCustomer {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1 = new Customer("Shivi");
		Customer c2 = (Customer) c1.clone();
		
		c2.setName("Ruhi");
		c2.account.setBalance(200);
		
		
		System.out.println("original object");
		System.out.println(c1.getName());
		System.out.println(c1.account.getBalance());
		
		System.out.println("cloned object");
		System.out.println(c2.getName());
		System.out.println(c2.account.getBalance());
		
		
		
		
	}

}
