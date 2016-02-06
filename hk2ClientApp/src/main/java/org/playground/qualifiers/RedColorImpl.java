package org.playground.qualifiers;
import org.jvnet.hk2.annotations.Service;
import org.playground.qualifiers.annotations.Red;


@Service @Red
public class RedColorImpl implements ColorInt{
	
	String Color  = "RED";

	public RedColorImpl() {
		// TODO Auto-generated constructor stub
	}

	public void sprayColor() {
		// TODO Auto-generated method stub
		System.out.println("Spray Painting using " + this.Color);
	}

}
