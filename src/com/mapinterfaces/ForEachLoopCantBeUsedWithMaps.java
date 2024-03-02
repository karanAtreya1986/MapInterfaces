package com.mapinterfaces;

import java.util.HashMap;
import java.util.Map;

public class ForEachLoopCantBeUsedWithMaps {

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

		// try using for each for iterating.
		// for (String s1 : m1) {
		// System.out.println(s1);
		// }
	}

}
