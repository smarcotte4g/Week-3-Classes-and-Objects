package com.classesandobjects;

import com.classesandobjects.bicycleclasses.MountainBike;
import com.classesandobjects.bicyclepackage.*;

public class Launcher {

	public static void main(String[] args) 
	{
		// create a Bicycle object
		Bicycle bike = new Bicycle((short)18, (short)20);
		MountainBike mBike = new MountainBike((short)6, (short)0, (short)2);
		
		// display the objects state
		display(bike);
		display(mBike);
		
		// create an object array
		Bicycle[] bikes = new Bicycle[3];
		bikes[0] = bike;
		bikes[1] = mBike;
		bikes[2] = new MountainBike((short)10, (short)12, (short)3);
		
		// show the state of the bike usinga for loop
		System.out.println();
		for(short i = 0; i < bikes.length; i++)
			display(bikes[i]);
		
		// show the state of the bike using a foreach loop
		System.out.println();
		for(Bicycle b : bikes)
			display(b);
		
		// exit gracefully
		System.exit(0);

	}

	private static void display(Bicycle bike) 
	{
		// TODO Auto-generated method stub
		System.out.println("Bike Gears: " + bike.getGears());
		System.out.println("Bike Speed: " + bike.getSpeed());
		
		if(bike.getClass() == new MountainBike().getClass())
		{
			MountainBike temp = (MountainBike)bike;
			System.out.println("Seat Height: " + temp.getSeatHeight());
		}
		
		System.out.println();
	}

}
