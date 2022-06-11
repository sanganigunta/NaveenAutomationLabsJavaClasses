package javaBasics;

public class CabBooking_BuilderPattern {
	
	public CabBooking_BuilderPattern login()
	{
		System.out.println("Login as a default user");
		return this;
	}
	
	public CabBooking_BuilderPattern login(String username, String password)
	{
		System.out.println("Entered user name and passwords are "+username+" :"+password);
		return this;
	}
	
	public CabBooking_BuilderPattern search(int distance)
	{
		System.out.println("find cab based on distance " + distance);
		return this;
	}
	
	public CabBooking_BuilderPattern search(int distance, String cabType)
	{
		System.out.println("find cab based on distance and cabType " + distance+" "+cabType);
		return this;
	}
	
	public CabBooking_BuilderPattern doPayment(String card, int cvv)
	{
		System.out.println("Do payment using card "+card+" "+cvv);
		return this;
	}
	
	public CabBooking_BuilderPattern doPayment(String upi)
	{
		System.out.println("Do payment using upi "+upi);
		return this;
	}
	
	public CabBooking_BuilderPattern generateInvoice()
	{
		System.out.println(" Generated invoice id");
		return this;
	}

	public CabBooking_BuilderPattern tripStarted(String fromlocation, String toLocation)
	{
		System.out.println("Trip stat and end locations are "+fromlocation+" "+toLocation);
		return this;
	}
	
	public CabBooking_BuilderPattern tripStarted(String fromlocation, String toLocation, int distance)
	{
		System.out.println("Trip stat and end locations are "+fromlocation+" "+toLocation+" "+distance);
		return this;
	}
	
	public CabBooking_BuilderPattern generateOrderId()
	{
		System.out.println("Generated order id");
		return this;
	}
	public CabBooking_BuilderPattern tripended(String fromlocation, String toLocation)
	{
		System.out.println("Trip stat and end locations are "+fromlocation+" "+toLocation);
		return this;
	}
	
	
	public CabBooking_BuilderPattern tripEnded(String fromlocation, String toLocation, int distance)
	{
		System.out.println("Trip stat and end locations are "+fromlocation+" "+toLocation+" "+distance);
		return this;
	}
	
	public CabBooking_BuilderPattern logout()
	{
		System.out.println("Logout from cab app");
		return this;
	}
	
}
