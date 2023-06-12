package com.inter;

public class BusinessMan extends Person implements RichMan{

	@Override
	public void earnMonry() {
		System.out.println("Earn Money");
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Throw party");
		
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("Give Donations");
		
	}

}
