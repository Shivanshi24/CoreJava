package com.Excep;

public class LoginException extends Exception {
	
	public LoginException() {
		
		super("Invalid User,,,!!!");
	}
	
	public LoginException(String msg) {
		super(msg);
	}

}
