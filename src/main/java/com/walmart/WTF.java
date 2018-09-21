package com.walmart;

import org.springframework.stereotype.Component;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.jws.WebService;
import javax.ws.rs.Produces;

@Component
@Path("wtf")
@WebService
public class WTF {

    @GET
    @Produces("application/json")
    public TestObject test() {
        return new TestObject("test");
    }

}