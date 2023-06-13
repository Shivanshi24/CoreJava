package com.collctn;

import java.util.*;
import java.util.ArrayList;

public class TestForEach {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(100);
		list.add(200);
		list.add(400);
		list.add(500);
		list.add(600);

		list.forEach(e -> {

			System.out.println(e);
		});
	}

}
