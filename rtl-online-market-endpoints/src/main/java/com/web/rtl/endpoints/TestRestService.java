package com.web.rtl.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/testing")
public class TestRestService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String testService() {
		return "Hurray its working";
	}
}
