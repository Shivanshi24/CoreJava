package com.compar;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	public int id;
	public String name;
	public String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	public Student() {
	}

	@Override
	public String toString() {

		return id + " " + name + " " + address;
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.id == o2.id) {
			return o1.name.compareTo(o2.name);
		}
		return o1.id - o2.id;
	}

}

	class OrderByName implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {

			return o1.name.compareTo(o2.name);
		}

	

}
