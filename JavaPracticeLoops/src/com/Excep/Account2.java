package com.Excep;

public class Account2 extends Exception {

	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amt) {
		int total = getBalance() + amt;
		System.out.println("Balance is = " + total);

	}

	public void withdrawl(int amt) throws InsufficientFund {
		int total = getBalance() - amt;

		if (total < 2000) {

		
				throw new InsufficientFund();

			
		} else {

			System.out.println("Sufficient balance");
		}

	}

}
