package com.walmart.service;

import java.util.Collection;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.walmart.data.Book;

@Path("books")
@WebService
public interface BookService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	Book get(@PathParam("id") int id);

	@GET
	@Path("/")
	@Produces("application/json")
	Collection<Book> getAll();

	@POST
	@Path("/")
	@Consumes("application/json")
	@Produces("application/json")
	Response add(Book book);

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	Book update(@PathParam("id") int id, Book book);

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	Book delete(@PathParam("id") int id);
}
