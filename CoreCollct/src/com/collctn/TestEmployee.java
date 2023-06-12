package com.collctn;

import java.util.*;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(2, "ruhi", "indore");
		Employee e2 = new Employee(2, "ruhi", "indore");
		
		List list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}
