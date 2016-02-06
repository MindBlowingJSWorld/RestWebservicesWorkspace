/**
 * 
 */
package org.rest.jersey.samples;

import java.util.Iterator;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;



/**
 * @author kulkamah
 *
 */

@Path("/customers")
public class PathService {
	
	
	@GET
	//@Path("/customer")
	public Response getCustomer() {
		
		String output = "This is Default Message returned";
		
		return Response
					.status(200)
					.entity(output)
					.build();
	}

	@GET
	@Path("/customer/{custName : [A-Za-z_-]*}")
	public Response getCustomerByName(@PathParam("custName") String custName) {
		
		String output = "Fetching customer Details for Customer name :   " + custName;
		
		return Response
					.status(200)
					.entity(output)
					.build();
	}

	
	@GET
	@Path("/customer/{custId: \\d+ }")
	public Response getCustomerById(@PathParam("custId") String custID) {
		
		String output = "Fetching customer Details for Customer ID : " + custID;
		
		return Response
					.status(200)
					.entity(output)
					.build();
	}
	
	
	@GET
	@Path("/customer/{dd}-{mm}-{yyyy}")
	public Response searchCustomerByBirthday(@PathParam("dd") String day,@PathParam("mm") String month, @PathParam("yyyy") String year) {
		
		String output = "Fetching customer Details for customer with birthdate : " + day + "-"+ month + "-" + year;
		
		return Response
					.status(200)
					.entity(output)
					.build();
	}
	
	
	@GET
	@Path("/customer")
	public Response getCustomerByCustIdAsQueryParam(
			@QueryParam("custID") String custID
			) {
		
		String output = "Fetching customer Details for customer ID : " + custID;
		
		return Response
					.status(200)
					.entity(output)
					.build();
	}
	
	@GET
	@Path("/customer/history")
	public Response getCustomerByCustIdAsQueryParam(
			@Context UriInfo info
			) {
		
		Map queryParams = info.getQueryParameters();
		
		Iterator iterator = queryParams.keySet().iterator();
		
		StringBuffer output = new StringBuffer("The Query Params received in request are as follows \n");
		
		while(iterator.hasNext()) {
			String key = (String)iterator.next();
			String value = info.getQueryParameters().getFirst(key);
			output.append("Key is : " + key + ", value : " + value + "\n");
		}
		
		return Response
					.status(200)
					.entity(output.toString())
					.build();
	}
	
	
	@GET
	@Path("/customer/matrix/{id}")
	public Response matrixParamDemoFunction(
			@PathParam("id") String id,
			@MatrixParam("dept") String department,
			@MatrixParam("teamName") String teamName
			) {
		
		StringBuffer output = new StringBuffer("Fetching customer Details for customer ID : " + id + "\n");
				
		output.append("Department Name : " + department);
		output.append("Team Name : " + teamName);
		
		return Response
					.status(200)
					.entity(output.toString())
					.build();
	}
	
	
}
