package com.collctn;

import java.util.*;
import java.util.ArrayList;

public interface Collect {
	
	public static void main(String[] args) {
		
		Collection list1= new ArrayList();
		Collection list2 = new ArrayList();
		
		list1.add("abc");
		list1.add(100);
		
		list2.add("xyz");
		list2.add(200);
		
		
		System.out.println(list1);
		
		//Add two collections;
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		//size of list1 after adding list2;
		list1.size();
		System.out.println("size of list1 = " + list1.size());
		
		//remove one object;
		
	    //list1.remove("abc");
	    //System.out.println(list1);
	    
	    //remove all object;
	    
	    list1.removeAll(list2);
	    System.out.println(list1);
	    
	    //size of collection;
	    //list1.size();
	    //System.out.println(list1.size());
	    
	    Collection list3 = new ArrayList();
	    list3.add("qwe");
	    list3.add(400);
	    
	    System.out.println(list3);
	    
	   // list3.clear();
	    //System.out.println(list3);
	    
	    //list2.retainAll(list2);
	    System.out.println(list1.retainAll(list2));
	    
	    //size of list 2;
		list2.size();
	    System.out.println("size of list2 = " + list2.size());
	    
	    //contains
	  System.out.println(list1.contains("abc"));
		
		
		
	}

}
