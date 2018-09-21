package com.walmart.dao;

import java.util.Collection;

import com.walmart.data.Book;

public interface BookDAO {
	Book get(int id);

	Collection<Book> getAll();

	int add(Book book);

	Book update(int id, Book book);

	Book delete(int id);
}
