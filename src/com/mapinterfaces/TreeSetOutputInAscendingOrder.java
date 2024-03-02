package com.mapinterfaces;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetOutputInAscendingOrder {

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

		t1.addAll(a1);

		for (String s1 : t1) {
			System.out.println(s1);
		}
	}
}
