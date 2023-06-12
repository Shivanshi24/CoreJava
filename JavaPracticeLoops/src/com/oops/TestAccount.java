package com.oops;

public class TestAccount {

	public static void main(String[] args) {

		
			Account a = new Account();

			
			a.setNumber("SBI1246");
			System.out.println(a.getNumber());
			
			a.setAccountType("Savings");
			System.out.println(a.getAccountType());

			
			a.setBalance(2000);
	
			a.deposit(120);
			
			a.Withdrawl(1000);
			
		

			

		 

	}

}
