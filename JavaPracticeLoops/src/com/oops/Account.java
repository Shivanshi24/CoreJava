package com.oops;

public class Account {

	private double balance = 0;

	private String number = null;

	private String accountType = null;
	
	//Getter Setter Method for number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	//Getter Setter Method for account type;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	//Getter Setter Method for balance;
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		double total = getBalance() + amount;
		
		if(total < 2000) {
			System.err.println("Insufficient Blance");
			
		}
		else 
			System.out.println("Balance is = " + total);
		}

	public void Withdrawl(double amount) {

		double total = getBalance() - amount;
		System.out.println("Balance is = " + total);

	}

}