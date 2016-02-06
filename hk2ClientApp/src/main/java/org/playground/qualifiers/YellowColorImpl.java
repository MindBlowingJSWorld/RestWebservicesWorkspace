package org.playground.qualifiers;

import org.jvnet.hk2.annotations.Service;
import org.playground.qualifiers.annotations.Yellow;


@Service @Yellow
public class YellowColorImpl implements ColorInt{
	
	String Color  = "YELLOW";

	public YellowColorImpl() {
		// TODO Auto-generated constructor stub
	}

	public void sprayColor() {
		// TODO Auto-generated method stub
		System.out.println("Spray Painting using " + this.Color);
	}

}
