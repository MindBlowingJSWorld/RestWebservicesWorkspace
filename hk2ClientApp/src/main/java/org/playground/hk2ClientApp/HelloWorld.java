package org.playground.hk2ClientApp;

import org.jvnet.hk2.annotations.Contract;


@Contract
public interface HelloWorld {

	public void helloWorld(String name);
	
	public void helloUser(String userName);

}
