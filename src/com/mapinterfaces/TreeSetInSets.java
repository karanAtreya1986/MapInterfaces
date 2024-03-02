package com.mapinterfaces;

import java.util.TreeSet;

public class TreeSetInSets {

	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Tiger");
		t1.add("Tiger");
		// t1.add(null);
		// t1.add(null);
		t1.add("Second");
		t1.add("Third");

		for (String s1 : t1)
			System.out.println(s1);
	}

}
