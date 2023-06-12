package com.basics.fast;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class FailSafe {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(1);
		v.add("abc");
		v.add(2);
		v.add("rgy");
		
		Enumeration e = v.elements();
		v.add(4);
		v.add("jhg");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		
		
	}

}
