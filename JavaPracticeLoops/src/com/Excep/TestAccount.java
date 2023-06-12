package com.Excep;



public class TestAccount {
	
	public static void main(String[] args) {
		
		try {
			AccountException  a = new AccountException();

			a.setBalance(1000);
			//sSystem.out.println(a.getBalance());

			a.setNumber("SBI1246");
			System.out.println(a.getNumber());

			a.deposit(500);
			System.out.println(a.getBalance());
			
			a.checkBalance();

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());

		}

	}

		}
			