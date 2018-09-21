package com.walmart.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DataStore {

	private static DataStore instance;

	public static DataStore getInstance() {
		if (instance == null) {
			instance = new DataStore();
		}
		return instance;
	}

	private int next;
	private Map<Integer, Book> books;

	private DataStore() {
		next = 0;
		books = new HashMap<Integer, Book>();
	}

	public Book get(int id) {
		return books.get(id);
	}

	public Collection<Book> getAll() {
		return books.values();
	}

	public int add(Book book) {
		int id = next++;
		book.setId(id);
		books.put(id, book);
		return id;
	}

	public Book update(int id, Book book) {
		book.setId(id);
		return books.put(id, book);
	}

	public Book delete(int id) {
		return books.remove(id);
	}
}
