package com.classesandobjects.bicycleclasses;

import com.classesandobjects.bicyclepackage.Bicycle;

public class MountainBike extends Bicycle 
{
	// attributes
	private short seatHeight;
	
	// constructors
	public MountainBike() 
	{
		super();
		
		// set default child values
		seatHeight = 0;
	}

	public MountainBike(short seatHeight, short gears, short speed) 
	{
		super(gears, speed);
		
		// set given child values
		setSeatHeight(seatHeight);
	}
	
	// accessor and mutator
	public short getSeatHeight() 
	{
		return seatHeight;
	}

	public void setSeatHeight(short seatHeight) 
	{
		if(seatHeight > 0)
			this.seatHeight = seatHeight;
		else
			this.seatHeight = 0;
	}

}
