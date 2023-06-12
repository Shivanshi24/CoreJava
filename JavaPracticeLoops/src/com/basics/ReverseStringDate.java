package com.basics;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReverseStringDate {
	
	public static void main(String[] args) throws ParseException {
		
		String src = "29/05/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse(src);
		System.out.println(src);
	}

}
