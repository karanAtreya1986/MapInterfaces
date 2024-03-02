package com.mapinterfaces;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveAllMethodInHashSet {

	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<>();
		h1.add("Tiger");
		h1.add("Tiger");
		h1.add(null);
		h1.add(null);
		h1.add("Lion");
		h1.add("Peacock");

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("First");
		a1.add("First");
		a1.add(null);
		a1.add(null);
		a1.add("Lion");
		a1.add("Third");

		h1.addAll(a1);

		// remove all
		h1.removeAll(a1); // returns true if removed else false

		for (String s1 : h1) {
			System.out.println(s1);
		}
	}

}
