package com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
	
		Person p = new Person();
		p.setName("Samayra");
		System.out.println(p.getname());
		
		p.setAddress("Vijay Nagar");
		System.out.println(p.getAddress());
		
		String s = "11/10/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		
		
		p.setDate(d);
		System.out.println(p.getDate());
		
		System.out.println(p.getAge(10));
		
		
		
	}
	


}
