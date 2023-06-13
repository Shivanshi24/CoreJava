package com.compar;

import java.util.*;

public class TestStudent {

	//Comparator method;
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(new Student(2, "simmi", "indore"));
		list.add(new Student(6, "mimansha", "ratlam"));
		list.add(new Student(4, "himadri", "dewas"));
		list.add(new Student(2, "garima", "mandsoree"));
		list.add(new Student(5, "diksha", "panna"));
		list.add(new Student(1, "chetan", "khachrod"));
		
        //Collections.sort(list, new Student());
		Collections.sort(list, new OrderByName());
		
		Iterator it = list.iterator();

		for (Object object : list) {
			System.out.println(object);
		}
	}

}
