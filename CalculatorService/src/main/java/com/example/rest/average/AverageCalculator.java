/**
 * 
 */
package com.example.rest.average;

import javax.ws.rs.core.Response;

/**
 * @author Mahesh
 *
 */
public class AverageCalculator {
	
	//Model to be used
	private AverageModel model;

	// This is the lock we will use in  our application
	Object lock = new Object();
	
	public void run() {
		
	}
	
	
	public Response getAverage(int[] numbers) {
		int average = 0;
		model = new AverageModel();
		model.setNumbers(numbers);
	
		
		
		
		
		
		return Response.status(200).entity("{average:" + average +"}").build();
	}

}
