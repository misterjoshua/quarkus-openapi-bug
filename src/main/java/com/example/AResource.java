package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/a")
public class AResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AResourceResponse get() {
        return new AResourceResponse("a");
    }

    static class AResourceResponse {
        private String message;

        AResourceResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}

