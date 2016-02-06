package org.playground.qualifiers;
import org.jvnet.hk2.annotations.Service;
import org.playground.qualifiers.annotations.Green;


@Service @Green
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
