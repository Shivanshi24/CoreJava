package com.compar;

import java.util.*; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Marksheet("rishi", 2));
		list.add(new Marksheet("nishi", 3));
		list.add(new Marksheet("vashi", 5));
		list.add(new Marksheet("kavish", 4));
		list.add(new Marksheet("atul", 1));

		

		Iterator it = list.iterator();

		for (Object object : list) {
			System.out.println(object);
		}

	}
}