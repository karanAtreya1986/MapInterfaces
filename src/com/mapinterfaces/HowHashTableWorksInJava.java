package com.mapinterfaces;

import java.util.Enumeration;
import java.util.Hashtable;

public class HowHashTableWorksInJava {

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

		// using enhanced for loop
		// for (Map.Entry<String, Integer> f1 : m1.entrySet()) {
		// String k1 = f1.getKey();// returns string.
		// Integer i1 = f1.getValue(); // returns Integer.
		// System.out.println("Key is " + k1);
		// System.out.println("Value is " + i1);
		// }

		// using enumeration

		Enumeration<String> e1 = m1.keys();
		while (e1.hasMoreElements()) {
			String s1 = e1.nextElement();
			System.out.println(s1);
			Integer i1 = m1.get(s1);
			System.out.println("Values are " + i1);

		}
	}

}
