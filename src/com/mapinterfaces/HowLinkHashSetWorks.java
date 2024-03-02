package com.mapinterfaces;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HowLinkHashSetWorks {

	public static void main(String[] args) {

		LinkedHashSet<String> h1 = new LinkedHashSet<>();
		h1.add("Tiger");
		h1.add("Tiger");
		h1.add(null);
		h1.add(null);
		h1.add("Lion");
		h1.add("Peacock");

		for (String s1 : h1) {
			System.out.println(s1);
		}
		System.out.println("============");

		// using iterator
		Iterator<String> it1 = h1.iterator();
		while (it1.hasNext()) {
			String it2 = it1.next();
			System.out.println(it2);
		}

	}

}
