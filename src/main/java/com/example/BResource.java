package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/b")
public class BResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "b";
    }
}
