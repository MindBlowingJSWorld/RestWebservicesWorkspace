package org.rest.jersey.samples;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;


@Path("/order")
public class OrderServices {

	@GET
	public Response getOrder(
			@HeaderParam("user-agent") String userAgent,
			@Context HttpHeaders headers
		) {
		
		System.out.println(headers.getRequestHeaders().toString());

		System.out.println(headers.getAcceptableMediaTypes().toString());
		
				
		return Response.status(200).entity("Data processed").build();	
		
		
	}
	
	@POST
	public Response postOrder(
			@FormParam("name") String name,
			@FormParam("order") String order
			) {
		
		String content = "Order for Name : " + name + ", Order : " + order + " has been processed successfully";
		return Response.status(200).entity(content).build();
			
	}
	
}
