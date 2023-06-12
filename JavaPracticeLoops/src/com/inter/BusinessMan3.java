package com.inter;

public class BusinessMan3 extends Person implements RichMan, SocialWork {

	@Override
	public void earnMonry() {
		// TODO Auto-generated method stub
		System.out.println("Earn Money");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Throw Party");
		
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("give Money");
		
	}

	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
		System.out.println("Help To Poors");
		
	}

}
