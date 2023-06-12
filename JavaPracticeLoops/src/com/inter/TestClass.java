package com.inter;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RichMan r = new BusinessMan();
		SocialWork sw = new BusinessMan2();
		BusinessMan3 b = new BusinessMan3();
		
		r.earnMonry();
		r.donation();
		r.party();

		System.out.println("");
		
		sw.helpToOthers();
		System.out.println("");
		
		b.earnMonry();
		b.donation();
		b.donation();
		b.helpToOthers();

	}

}
