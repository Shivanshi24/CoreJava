package com.collctn;

import java.util.*;

public interface PersonList {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(10, "abc", "Indore");
		Person p2 = new Person(20, "def", "Indore");
		Person p3 = new Person(30, "ghi", "Indore");
		Person p4 = new Person(40, "xyz", "Indore");

		List list = new ArrayList();
		
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		//Iterator method to extract values;
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			//Person p = (Person) it.next();
			//System.out.println(p);
			
			//or;
			System.out.println(it.next());
			
		}

	}

}
