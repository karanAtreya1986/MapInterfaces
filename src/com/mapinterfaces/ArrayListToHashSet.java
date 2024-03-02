package com.mapinterfaces;

import java.util.HashSet;

public class ArrayListToHashSet {

	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<>();
		h1.add("Tiger");
		h1.add("Tiger");
		h1.add(null);
		h1.add(null);
		h1.add("Lion");
		h1.add("Peacock");

		// try adding different data type.

		//		ArrayList<Integer> a1 = new ArrayList<>();
		//		a1.add(1);
		//		a1.add(1);
		//		a1.add(0);
		//		a1.add(0);
		//		a1.add(2);
		//		a1.add(3);

		// ArrayList<String> a1 = new ArrayList<>();
		// a1.add("First");
		// a1.add("First");
		// a1.add(null);
		// a1.add(null);
		// a1.add("Second");
		// a1.add("Third");

		//h1.addAll(a1);

		for (String s1 : h1) {
			System.out.println(s1);
		}
	}

}
