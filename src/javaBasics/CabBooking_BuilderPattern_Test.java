package javaBasics;

public class CabBooking_BuilderPattern_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CabBooking_BuilderPattern cabBooking = new CabBooking_BuilderPattern();
		cabBooking.login("canbookdivya@gmail.com", "divya@123")
		  .search(25)
		  .generateInvoice()
		  .doPayment("testup@gmail.com")
		  .tripStarted("Banglore", "Mysore", 70)
		  .tripended("Banglore", "Mysore")
		  .generateOrderId()
		  .logout();
		  
		System.out.println("#####################################################");
		cabBooking.login()
		.search(100, "Foard")
		.logout();
		
		cabBooking.login("test1234@gmail.com", "test123")
		.doPayment("123456780", 678)
		.generateInvoice()
		.tripStarted("Bangalore", "Punganur")
		.tripended("Bangalore", "Punganur")
		.logout();
		
		  
		  
		
	}

}
