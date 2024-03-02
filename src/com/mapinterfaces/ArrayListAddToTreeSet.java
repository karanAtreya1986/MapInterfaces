package com.mapinterfaces;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListAddToTreeSet {

	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Tiger");
		t1.add("Tiger");
		t1.add("Second");
		t1.add("Third");

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Tiger");
		a1.add("First");
		a1.add("First");
		//a1.add(null);
		//a1.add(null);

		boolean b1 = t1.addAll(a1);// true if set changed because of addition
		System.out.println(b1);
	}
}
