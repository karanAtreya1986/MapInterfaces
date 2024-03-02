package com.mapinterfaces;

import java.util.Vector;

public class SizeOfVectorsList {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(2, 5);
		v1.addElement("Tiger");
		v1.addElement("Tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("Lion");
		v1.addElement("Myna");

		// size
		int s1 = v1.size();
		System.out.println(s1);
	}

}
