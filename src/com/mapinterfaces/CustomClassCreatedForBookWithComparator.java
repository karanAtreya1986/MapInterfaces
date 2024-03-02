package com.mapinterfaces;

public class CustomClassCreatedForBookWithComparator implements Comparable<CustomClassCreatedForBookWithComparator> {

	public int id;
	public String author, publisher, title;
	public int quantity;

	public CustomClassCreatedForBookWithComparator(int id, String author, String publisher, String title,
			int quantity) {
		super();
		this.id = id;
		this.author = author;
		this.publisher = publisher;
		this.title = title;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(CustomClassCreatedForBookWithComparator o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		} else {
			return 0;
		}

	}

}
