package com.classesandobjects.bicyclepackage;

public class Bicycle 
{
	// attributes
	protected short gears;
	protected short speed;
	private static final short MAX_SPEED = 40;
	
	// constructors
	public Bicycle()
	{
		super();
		gears = 0;
		speed = 0;
	}
	
	public Bicycle(short gears, short speed)
	{
		super();
		this.setGears(gears);
		setSpeed(speed);
	}
	
	// behaviors
	public void applyBrake(short decrement)
	{
		if(speed - decrement > 0)
			speed -= decrement; // speed = speed - decrement;
		else
			speed = 0;
	}
	
	public void applyBreak()
	{
		applyBrake((short) 1);
	}
	
	public void speedUp(short increment)
	{
		if(speed + increment < MAX_SPEED)
			speed += increment;
		else
			speed = MAX_SPEED;
	}
	
	public void speedUp()
	{
		speedUp((short) 1);
	}
	
	// accessors and mutators
	public short getGears() 
	{
		return gears;
	}

	public void setGears(short gears) 
	{
		if(gears > 0)
			this.gears = gears;
		else
			this.gears = 0;
	}

	public short getSpeed() 
	{
		return speed;
	}

	public void setSpeed(short speed) 
	{
		if(speed > 0)
			this.speed = speed;
		else
			this.speed = 0;
	}
	
}
