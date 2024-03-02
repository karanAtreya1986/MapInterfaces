package com.mapinterfaces;

import java.util.HashSet;

public class RemoveMethodInHashSet {

	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<>();
		h1.add("Tiger");
		h1.add("Tiger");
		h1.add(null);
		h1.add(null);
		h1.add("Lion");
		h1.add("Peacock");

		boolean b1=h1.remove("Peacock");//pass in the value. returns true if the set had the element to be removed, else false.
		System.out.println(b1);
	}

}
