package com.mapinterfaces;

import java.util.HashMap;
import java.util.Map;

public class RemoveMethodInHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> m1 = new HashMap<>();
		m1.put("Karan", 1);
		m1.put("Karan", 1);
		m1.put("Karan", 2);
		m1.put("Karan", -98763);
		m1.put(null, null);
		m1.put(null, null);
		m1.put(null, 3234324);
		m1.put(null, 3234324);
		m1.put("Tiger", null);
		m1.put("Tiger", null);
		m1.put("Lion", null);

		Integer i2 = m1.remove("Tiger");// pass in the key to remove that particular key value pair.
		System.out.println(i2); // this will return previous value for the key.
		System.out.println("============");

		for (Map.Entry<String, Integer> f1 : m1.entrySet()) {
			String k1 = f1.getKey();// returns string.
			Integer i1 = f1.getValue(); // returns Integer.
			System.out.println("Key is " + k1);
			System.out.println("Value is " + i1);
		}
	}

}
