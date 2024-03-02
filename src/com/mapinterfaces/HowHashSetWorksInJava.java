package com.mapinterfaces;

import java.util.HashSet;

public class HowHashSetWorksInJava {

	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<>();
		h1.add("Tiger");
		h1.add("Tiger");
		h1.add(null);
		h1.add(null);
		h1.add("Lion");
		h1.add("Peacock");

		// use iterator
		// Iterator<String> it1=h1.iterator();
		// while(it1.hasNext()) {
		// String s1=it1.next();
		// System.out.println(s1);
		// }

		// use for loop
		for (String s1 : h1) {
			System.out.println(s1);
		}
	}

}
