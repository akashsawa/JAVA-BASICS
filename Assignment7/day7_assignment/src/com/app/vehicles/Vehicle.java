package com.app.vehicles;

import java.text.SimpleDateFormat;

//Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
//tight encapsulation
//state(data members)  : registrationNo : String , color : String , price : double
//registrationNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique ID)
//Override toString to return complete state.
//
//Create a class TestVehicle under the package "tester"
//Accept details of 2 vehicles from user . 
//Display "SAME" or "DIFFERENT" , using inherited "equals" method , from Object class.
//Observe & conclude
//Is there any problem ?
//If yes : think of the solution.



public class Vehicle 
{
	private String regno;
	private String color;
	private double price;
	private String purchased;
	public static SimpleDateFormat sdf;
	public Vehicle(String regno, String color, double price) {
		super();
		this.regno = regno;
		this.color = color;
		this.price = price;
	}
	static
	{
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", color=" + color + ", price=" + price + ", purchased=" + sdf.format(purchased); //formated date 
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object veh)
	{
		if( veh != null ) 
		{
			if(veh instanceof Vehicle)
			{
				if(this.regno.equals(((Vehicle)veh).regno));
					return true;
			}
		}
		return false;
	}
	
}
