package com.mapinterfaces;

import java.util.HashSet;

public class SizeOfHashSet {

	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<>();
		h1.add("Tiger");
		h1.add("Tiger");
		h1.add(null);
		h1.add(null);
		h1.add("Lion");
		h1.add("Peacock");

		int s1 = h1.size();
		System.out.println(s1);
	}

}
