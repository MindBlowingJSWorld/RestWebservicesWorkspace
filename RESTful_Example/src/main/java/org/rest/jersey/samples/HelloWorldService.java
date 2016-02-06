/**
 * 
 */
package org.rest.jersey.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author kulkamah
 *
 */

@Path("/welcome")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getWelcomeMessage(@PathParam("param") String userName) {
		
		String output = "Hello my friend " + userName + ", From Jersey";
		
		return Response
					.status(200)
					.entity(output)
					.build();
	}

}
