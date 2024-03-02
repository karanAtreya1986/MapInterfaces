package com.mapinterfaces;

import java.util.Vector;

public class CapacityOfVectorList {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(2, 5);
		v1.addElement("Tiger");
		v1.addElement("Tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("Lion");
		v1.addElement("Myna");

		// capacity
		int c1 = v1.capacity();
		System.out.println(c1);
	}

}
