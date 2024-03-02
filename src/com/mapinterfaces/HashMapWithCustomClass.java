package com.mapinterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithCustomClass {

	public static void main(String[] args) {

		HashMap<Integer, CustomClassCreatedForBook> h1 = new HashMap<>();

		CustomClassCreatedForBook c1 = new CustomClassCreatedForBook(1, "Jackie", "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c2 = new CustomClassCreatedForBook(1, "Jackie", "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c3 = new CustomClassCreatedForBook(-9343, null, "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c4 = new CustomClassCreatedForBook(-9343, null, "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c5 = new CustomClassCreatedForBook(34345435, "Peacocok", "Tiger", "Bull", -234324);
		CustomClassCreatedForBook c6 = new CustomClassCreatedForBook(1345435, null, "Tiger", "Bull", -34534524);

		h1.put(1, c6);
		h1.put(1, c5);
		h1.put(-2342423, c4);
		h1.put(435345435, c3);
		h1.put(0, c2);
		h1.put(0, c1);

		for (Map.Entry<Integer, CustomClassCreatedForBook> m1 : h1.entrySet()) {
			Integer i1 = m1.getKey();
			System.out.println("Key is " + i1);
			CustomClassCreatedForBook cb1 = m1.getValue();
			System.out.println("Value is " + cb1.author + " " + cb1.id + " " + cb1.publisher + " " + cb1.quantity + " "
					+ cb1.title);
		}

	}

}
