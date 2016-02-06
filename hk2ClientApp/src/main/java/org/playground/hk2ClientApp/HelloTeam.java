package org.playground.hk2ClientApp;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.jvnet.hk2.annotations.Service;

@Service
public class HelloTeam {

	private HelloWorld service;
	
	
	public HelloTeam() {
		// TODO Auto-generated constructor stub
	
		ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
	      
		HelloWorld myService = locator.getService(HelloWorld.class);
		this.service = myService;
		
		service.helloUser("Mahesh Kulkarni");
		service.helloWorld("Ajay Kulkarni");
		
	      
	}
	
	

}
