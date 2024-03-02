package com.mapinterfaces;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class CheckingIfIteratorCanTraverseMaps {

	public static void main(String[] args) {

		Hashtable<String, Integer> m1 = new Hashtable<>();
		m1.put("Karan", 1);
		m1.put("Karan", 1);
		m1.put("Karan", 2);
		m1.put("Karan", -98763);
		// m1.put(null, null);
		// m1.put(null, null);
		// m1.put(null, 3234324);
		// m1.put(null, 3234324);
		// m1.put("Tiger", null);
		// m1.put("Tiger", null);
		// m1.put("Lion", null);

		// using normal iterator.
		// m1.ite

		// using special iterator
		Iterator<Entry<String, Integer>> it1 = m1.entrySet().iterator();
		boolean b1 = it1.hasNext();// true if the iteration has more elements
		// while (b1) {
		// Entry<String, Integer> et1 = it1.next();
		while (it1.hasNext()) {
			Entry<String, Integer> et1 = it1.next();
			String k1 = et1.getKey();
			Integer it3 = et1.getValue();
			System.out.println("Key is " + k1 + " " + "Value is " + it3);
		}
	}

}
