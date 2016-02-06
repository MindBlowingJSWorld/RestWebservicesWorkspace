package com.example.rest.calculators;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by Mahesh on 2/20/2015.
 */

@Path("/simpleCalculator")
public class SimpleCalculator {

    @GET
    public Response DefaultMethod() {
        String output = new String("You have visited a default page...");

        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }
    
    @GET
    @Path("/add")
    public Response addTheseNumbers(@QueryParam("num1") int number1, @QueryParam("num2") int number2) {

        int val = number1 + number2;
        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    
    @GET
    @Path("/subtract")
    public Response subtractTheseNumbers(@QueryParam("num1") int number1, @QueryParam("num2") int number2) {

        int val = number1 - number2;
        

        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    
    @GET
    @Path("/multiply")
    public Response multiplyTheseNumbers(@QueryParam("num1") int number1, @QueryParam("num2") int number2) {

        int val = number1 * number2;

        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    
    @GET
    @Path("/divide")
    public Response divideTheseNumbers(@QueryParam("num1") int number1, @QueryParam("num2") int number2) {

        int val = number1 / number2;

        String result = "<h2>Result of this transaction is : " + val + "</h2>";

        return Response.status(200).entity(result).build();
    }
    

}
