package com.walmart.service;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.walmart.dao.BookDAO;
import com.walmart.data.Book;

@Component
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;

	public Book get(int id) {
		return bookDAO.get(id);
	}

	public Collection<Book> getAll() {
		return bookDAO.getAll();
	}

	public Response add(Book book) {
		int id = bookDAO.add(book);
		return Response.ok().entity("{id:" + id + "}").build();
	}

	public Book update(int id, Book book) {
		return bookDAO.update(id, book);
	}

	public Book delete(int id) {
		return bookDAO.delete(id);
	}
}
