package com.collctn;

import java.util.*;

public class TestStudent {

	public static void main(String[] args) {

		List list = new LinkedList();

		list.add(new Student(1, "rishi", "indore"));
		list.add(new Student(2, "sudha", "dewas"));

		for (Object object : list) {
			System.out.println(object);
		}

	}

}
