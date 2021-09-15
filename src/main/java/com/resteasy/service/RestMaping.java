package com.resteasy.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.resteasy.entity.Student;

@Path("/hello")
public class RestMaping {
	
	@GET
	@Path("/something")
	public String saySomething() {
		return "hi parvej welcome to resteasy learning";
	}
	
	
	@GET
	@Path("/helo/{name}")
	public String sayHello(@PathParam("name") String name) {
		return name;
	}
	
	@GET
	@Path("/hi")
	public Response sayHi() {
		String msg = "this is using Response return type";
		return Response.ok().entity(msg).build();
	}
  
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addStudent() {
		Student st = new Student();
		st.setId(1);
		st.setName("parvej");
		st.setCity("surat");
		return Response.ok().entity(st).build();
		
	}
}
