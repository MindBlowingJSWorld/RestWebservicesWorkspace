package com.example.rest.calculators;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/RestCalculator")
public class RestCalculator {
	
	@GET
    @Path("/add")
    public Response addTheseNumbers(@MatrixParam("num1") int number1, @MatrixParam("num2") int number2) {

        int val = number1 + number2;
        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    
    @GET
    @Path("/subtract")
    public Response subtractTheseNumbers(@MatrixParam("num1") int number1, @MatrixParam("num2") int number2) {

        int val = number1 - number2;
        

        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    
    @GET
    @Path("/multiply")
    public Response multiplyTheseNumbers(@MatrixParam("num1") int number1, @MatrixParam("num2") int number2) {

        int val = number1 * number2;

        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    
    @GET
    @Path("/divide")
    public Response divideTheseNumbers(@MatrixParam("num1") int number1, @MatrixParam("num2") int number2) {

        int val = number1 / number2;

        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    
    @GET
    @Path("{action}")
    public Response operation(@PathParam("action") String action,
    						  @MatrixParam("num1") int number1, 
    						  @MatrixParam("num2") int number2) {
    	
    	int val = 0;
    	
    	switch(action){
    	
    		case "add":  
    				val = number1 + number2;
    				break;
    	
    		case "subtract":
    				val = number1 - number2;
    				break;
    	
    		case "multiply": 
    				val = number1 * number2;
    				break;
    		
    		case "divide":
    				val = number1 / number2;
    				break;
    	
    		default:
    				val = number1 + number2;
    				break;
    
    	}

        String result = "<h2>Result of this transaction is : " + val + "</h2>";
        return Response.status(200).entity(result).build();
    }

}
