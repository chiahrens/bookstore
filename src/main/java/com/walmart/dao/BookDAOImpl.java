package com.walmart.dao;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.walmart.data.Book;
import com.walmart.data.DataStore;

@Component
public class BookDAOImpl implements BookDAO {
	public Book get(int id) {
		return DataStore.getInstance().get(id);
	}

	public Collection<Book> getAll() {
		return DataStore.getInstance().getAll();
	}

	public int add(Book book) {
		return DataStore.getInstance().add(book);
	}

	public Book update(int id, Book book) {
		return DataStore.getInstance().update(id, book);
	}

	public Book delete(int id) {
		return DataStore.getInstance().delete(id);
	}
}
