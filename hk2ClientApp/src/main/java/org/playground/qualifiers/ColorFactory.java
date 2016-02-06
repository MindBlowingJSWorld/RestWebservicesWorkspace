/**
 * 
 */
package org.playground.qualifiers;

import javax.inject.Inject;
import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;
import org.playground.qualifiers.annotations.Green;
import org.playground.qualifiers.annotations.Red;
import org.playground.qualifiers.annotations.Yellow;

/**
 * @author kulkamah
 *
 */

@Service
public class ColorFactory {
	
	@Inject @Yellow
	private ColorInt yellowColorService;
	
	@Inject @Green
	private ColorInt greenColorService;
	
	@Inject @Red
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
