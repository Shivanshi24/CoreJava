package com.basics.fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(10);
		list.add("two");
		list.add(20);
		list.add("def");
		
		Iterator it = list.iterator();	
		
		list.add(30);
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
