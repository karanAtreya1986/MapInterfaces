package com.mapinterfaces;

import java.util.HashMap;
import java.util.Map;

public class HowHashMapWorksInJava {

	public static void main(String[] args) {

		Map<String, Integer> m1 = new HashMap<>();
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

		for (Map.Entry<String, Integer> f1 : m1.entrySet()) {
			String k1 = f1.getKey();// returns string.
			Integer i1 = f1.getValue(); // returns Integer.
			System.out.println("Key is " + k1);
			System.out.println("Value is " + i1);
		}
	}

}
