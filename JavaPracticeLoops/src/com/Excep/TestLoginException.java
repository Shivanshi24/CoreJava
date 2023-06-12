package com.Excep;



public class TestLoginException {
	
	public static void main(String[] args) {
		try {
		String name = "admi";
		
		if(name.equals("admin")) {
			System.out.println("Valid User!!!");
			
		}
	else{
		
		throw new LoginException("Invalid User,,!!");
		
			
		}
		}  
		 catch (Exception e) {
		System.out.println(e.getMessage());
		
		}
	}

}
