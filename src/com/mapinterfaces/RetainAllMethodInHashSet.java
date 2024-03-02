package com.mapinterfaces;

import java.util.ArrayList;
import java.util.HashSet;

public class RetainAllMethodInHashSet {

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

		// retain all
		boolean b1 = h1.retainAll(a1);// true if this set changed as a result of the call
		System.out.println(b1);
		System.out.println("=======");

		for (String s1 : h1) {
			System.out.println(s1);
		}
	}

}
