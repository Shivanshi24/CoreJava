package com.compar;
import java.lang.*;
public class Marksheet implements Comparable<Marksheet> {

	public int rollNo;
	public String name;

	public Marksheet(String name, int rollNo) {

		this.rollNo = rollNo;
		this.name = name;

	}

	@Override
	public String toString() {

		return rollNo + " " + name;
	}

	@Override
	public int compareTo(Marksheet o) {

		return this.rollNo - o.rollNo;
	}

}
