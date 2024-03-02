package com.mapinterfaces;

import java.util.TreeSet;

public class TreeSetWithCustomClassComparable {

	public static void main(String[] args) {

		TreeSet<CustomClassCreatedForBookWithComparator> h1 = new TreeSet<>();

		CustomClassCreatedForBookWithComparator c1 = new CustomClassCreatedForBookWithComparator(1, "Jackie", "Tiger",
				"Bull", 5690);
		CustomClassCreatedForBookWithComparator c2 = new CustomClassCreatedForBookWithComparator(1, "Jackie", "Tiger",
				"Bull", 5690);
		CustomClassCreatedForBookWithComparator c3 = new CustomClassCreatedForBookWithComparator(-9343, null, "Tiger",
				"Bull", 5690);
		CustomClassCreatedForBookWithComparator c4 = new CustomClassCreatedForBookWithComparator(-9343, null, "Tiger",
				"Bull", 5690);
		CustomClassCreatedForBookWithComparator c5 = new CustomClassCreatedForBookWithComparator(34345435, "Peacocok",
				"Tiger", "Bull", -234324);
		CustomClassCreatedForBookWithComparator c6 = new CustomClassCreatedForBookWithComparator(1345435, null, null,
				"Bull", -34534524);

		h1.add(c6);
		h1.add(c5);
		h1.add(c4);
		h1.add(c3);
		h1.add(c2);
		h1.add(c1);

		for (CustomClassCreatedForBookWithComparator cb1 : h1) {
			String a1 = cb1.author;
			int id1 = cb1.id;
			String pb1 = cb1.publisher;
			int qt1 = cb1.quantity;
			String tt1 = cb1.title;
			System.out.println(a1 + " " + id1 + " " + pb1 + " " + qt1 + " " + tt1 + " ");
		}

	}

}
