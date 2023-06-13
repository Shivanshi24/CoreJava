package com.collctn;

import java.util.*;
import java.util.ArrayList;

public class TestStream {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("1");
		list.add("one");
		list.add("4");
		list.add("4");
		list.add("2");
		list.add("3");
		list.add("two");

		list.stream().sorted().distinct().forEach(e -> {
			System.out.println(e);
		});
	}

}
