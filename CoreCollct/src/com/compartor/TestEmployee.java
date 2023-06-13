
package com.compartor;

import java.util.*;

public class TestEmployee {
	
	public static void main(String[] args) {
		
   List list = new ArrayList();
		
		list.add(new Employee(2, "shivu", "indore"));
		list.add(new Employee(1, "mridula","pune"));
		list.add(new Employee(6, "swati", "ujjain"));
		list.add(new Employee(4, "rahul", "dewas"));
		list.add(new Employee(6, "aditi", "ratlam"));
		list.add(new Employee(5, "ayan", "bhopal"));
		
		Collections.sort(list, new Employee());
		
		for( Object object : list) {
			System.out.println(object);
		}
		
	}

}
