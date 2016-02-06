package org.playground.named;
import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;


@Service @Named
public class GreenColorImpl implements ColorInt{
	
	String Color  = "GREEN";

	public GreenColorImpl() {
		// TODO Auto-generated constructor stub
	}

	public void sprayColor() {
		// TODO Auto-generated method stub
		System.out.println("Spray Painting using " + this.Color);
	}

}
