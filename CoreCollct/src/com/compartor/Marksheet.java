package com.compartor;

import java.util.*;

public class Marksheet implements Comparator<Marksheet> {

	public int id;
	String name;
	String address;

	public Marksheet() {

	}

	public Marksheet(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {

		return id + " " + name + " " + address;
	}

	@Override
	public int compare(Marksheet o1, Marksheet o2) {

		return o1.id - o2.id;
	}

}

class OrderByName implements Comparator<Marksheet>{
	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class OrderByAddress implements Comparator<Marksheet>{
	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		return o1.address.compareTo(o2.address);
	}
	
}
