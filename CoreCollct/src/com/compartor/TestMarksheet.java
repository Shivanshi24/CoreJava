package com.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
	
		List list = new ArrayList();
		
		list.add(new Marksheet(3, "ravi", "indore"));
		list.add(new Marksheet(4, "tarun", "dewas"));
		list.add(new Marksheet(2, "naman", "bhopal"));
		list.add(new Marksheet(5, "shiv", "ujjain"));
		list.add(new Marksheet(1, "virag", "ratlam"));
		
		Collections.sort(list, new OrderByAddress());
		
		
		Iterator it = list.iterator();
		
		for(Object object : list) {
			System.out.println(object);
		}
		
		
		
	}

}
