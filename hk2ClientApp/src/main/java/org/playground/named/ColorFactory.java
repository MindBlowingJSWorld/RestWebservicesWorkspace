/**
 * 
 */
package org.playground.named;

import javax.inject.Inject;
import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

/**
 * @author kulkamah
 *
 */

@Service
public class ColorFactory {
	
	@Inject @Named("YellowColorImpl")
	private ColorInt yellowColorService;
	
	@Inject @Named("GreenColorImpl")
	private ColorInt greenColorService;
	
	@Inject @Named("RedColorImpl")
	private ColorInt redColorService;
	

	/**
	 * 
	 */
	public ColorFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public void sprayPaint(String color) {
		
		switch(color) {
			
		case "RED" :
			this.redColorService.sprayColor();
			break;
		case "GREEN" :
			this.greenColorService.sprayColor();
			break;
		case "YELLOW" :
			this.yellowColorService.sprayColor();
			break;
		default:
			System.out.println("Default color Selection");
			this.yellowColorService.sprayColor();
			break;
		}
		
	}

}
