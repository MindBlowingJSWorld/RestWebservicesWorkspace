/**
 * 
 */
package org.playground.hk2ClientApp;

import org.jvnet.hk2.annotations.Service;

/**
 * @author kulkamah
 *
 */

@Service
public class HelloWorldImpl implements HelloWorld {

	/**
	 * 
	 */
	public HelloWorldImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.playground.hk2ClientApp.HelloWorldInterface#helloWorld(java.lang.String)
	 */
	public void helloWorld(String name) {
		System.out.println("Hello World from HK2 my friend,  " + name);
	}

	/* (non-Javadoc)
	 * @see org.playground.hk2ClientApp.HelloWorldInterface#helloUser(java.lang.String)
	 */
	public void helloUser(String userName) {
		System.out.println("Hello " + userName + ", have a good day mate");
	}

}
