package com.mapinterfaces;

import java.util.TreeSet;

public class TreeSetWithCustomClass {

	public static void main(String[] args) {

		TreeSet<CustomClassCreatedForBook> h1 = new TreeSet<>();

		CustomClassCreatedForBook c1 = new CustomClassCreatedForBook(1, "Jackie", "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c2 = new CustomClassCreatedForBook(1, "Jackie", "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c3 = new CustomClassCreatedForBook(-9343, null, "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c4 = new CustomClassCreatedForBook(-9343, null, "Tiger", "Bull", 5690);
		CustomClassCreatedForBook c5 = new CustomClassCreatedForBook(34345435, "Peacocok", "Tiger", "Bull", -234324);
		CustomClassCreatedForBook c6 = new CustomClassCreatedForBook(1345435, null, null, "Bull", -34534524);

		h1.add(c6);
		h1.add(c5);
		h1.add(c4);
		h1.add(c3);
		h1.add(c2);
		h1.add(c1);

		for (CustomClassCreatedForBook cb1 : h1) {
			String a1 = cb1.author;
			int id1 = cb1.id;
			String pb1 = cb1.publisher;
			int qt1 = cb1.quantity;
			String tt1 = cb1.title;
			System.out.println(a1 + " " + id1 + " " + pb1 + " " + qt1 + " " + tt1 + " ");
		}

	}

}
