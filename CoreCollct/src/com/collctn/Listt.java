package com.collctn;

import java.util.*;

public interface Listt {
	
	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		
		//Insert element;
		list1.add(1);
		System.out.println(list1);
		
		//insert element at particular index;
		list1.add(1, "qwe");
		System.out.println("List1 = " + list1);
		
		list1.add(2, "3");
		System.out.println(list1);
		
		//To show 'i'th value;
		list1.get(2);
		System.out.println("Value at index 2 = " +list1.get(2));
		
		//Remove 'i'th value;
		list1.remove(1);
		System.out.println("After removing value from 1st index = " + list1);
		
		//Replace value;
		list1.set(0, "ghi");
		System.out.println("List after replace = " + list1);
		
		//Search object;
		System.out.println(list1.indexOf("3"));
		
		//search last index ;
		System.out.println("Last index is = " + list1.lastIndexOf("ghi"));
		
		//Sublist;
		
		System.out.println("Sublist of list1 is = " + list1.subList(0, 1));
		
		
		
		
	}

}
