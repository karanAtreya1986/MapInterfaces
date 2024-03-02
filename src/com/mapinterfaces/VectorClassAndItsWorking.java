package com.mapinterfaces;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClassAndItsWorking {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(2, 5);
		v1.add("Tiger");
		v1.add("Tiger");
		v1.add(null);
		v1.add(null);
		v1.add("Lion");
		v1.add("Myna");

		Enumeration<String> e1 = v1.elements();
		while (e1.hasMoreElements()) {
			String s1 = e1.nextElement();
			System.out.println(s1);
		}
	}

}
