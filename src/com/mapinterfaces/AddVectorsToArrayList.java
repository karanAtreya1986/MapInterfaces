package com.mapinterfaces;

import java.util.ArrayList;
import java.util.Vector;

public class AddVectorsToArrayList {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>();
		v1.add("Tiger");
		v1.add("Tiger");
		v1.add(null);
		v1.add(null);
		v1.add("Lion");
		v1.add("Peacock");

		//add incompatible data types.
		// ArrayList<Integer> a1a2 = new ArrayList<>(v1);
		// a1a2.add(1);
		// a1a2.add(1);
		// a1a2.add(0);
		// a1a2.add(0);
		// a1a2.add(-372746734);
		// a1a2.add(234234324);

		ArrayList<String> a1 = new ArrayList<>(v1);
		a1.add("First");
		a1.add("First");
		a1.add(null);
		a1.add(null);
		a1.add("Second");
		a1.add("Third");

		for (String s1 : a1) {
			System.out.println(s1);
		}

	}

}
