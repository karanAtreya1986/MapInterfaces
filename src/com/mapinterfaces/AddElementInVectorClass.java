package com.mapinterfaces;

import java.util.Enumeration;
import java.util.Vector;

public class AddElementInVectorClass {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(2, 5);
		v1.addElement("Tiger");
		v1.addElement("Tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("Lion");
		v1.addElement("Myna");

		Enumeration<String> e1 = v1.elements();
		while (e1.hasMoreElements()) {
			String s1 = e1.nextElement();
			System.out.println(s1);
		}
	}

}
