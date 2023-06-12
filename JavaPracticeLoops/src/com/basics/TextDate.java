package com.basics;

import java.util.*;

import java.text.*;

public interface TextDate {
	
	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(today);
		System.out.println(s);
		
		
	}

}
