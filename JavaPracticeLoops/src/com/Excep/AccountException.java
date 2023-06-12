package com.Excep;



public class AccountException extends Exception {
	
	private double balance = 0;
	
	private String number = null;
	
	public AccountException() {
		super("Insufficient balance");

	}
	
	public void setNumber(String number) {
		this.number = number;
		
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		double total = getBalance() + amount;
		balance = total;
		
	}
	
	public void checkBalance() throws AccountException {
		double b = getBalance();
		if(b < 2000) {
			throw new AccountException();
		}
		
		else {
			System.out.println("Sufficient balance!!!");
		}
	}

}

	
