package com.walmart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.jws.WebService;
import javax.ws.rs.Produces;

/* jax-rs path /hello */
@Path("hello")
@WebService
public interface HelloWorld {
    @GET
    @Produces("text/plain")
    String sayHi(@QueryParam("name") String text);

    @GET
    @Path("/{name}")
    @Produces("text/plain")
    String hello(@PathParam("name") String text);

    @GET
    @Path("/test")
    @Produces("application/json")
    TestObject test();
}