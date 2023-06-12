package com.cloning;

public class TestCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		 Account a1 = new Account(100);
		 Account a2 = (Account) a1.clone();
		 
		 a2.setBalance(20);
		 
		 System.out.println(a1.getBalance());
		 System.out.println(a2.getBalance());
	}

}
