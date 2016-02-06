/**
 * 
 */
package org.playground.named;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

/**
 * @author kulkamah
 *
 */
public class ColorTest {

	/**
	 * 
	 */
	public ColorTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
		
		//ColorInt myService = locator.getService(YelloColorImpl.class);
		//ColorInt myService = locator.getService(ColorInt.class);
		//ColorInt myService = locator.getService(YelloColorImpl.class);
		//myService.sprayColor();
		
		ColorFactory colorService = locator.getService(ColorFactory.class);
		colorService.sprayPaint("Blue");
	}

}
