package exceptionHandling;

public class Throwsconcept {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Throwsconcept tc = new Throwsconcept();
		tc.m1();
	}
	
	public void m1() 
	{
		m2();
	}
	
	public void m2() throws ArithmeticException
	
	{
		
		
		try {
			m3();
			
			}
			catch(ArithmeticException ae)
			{
				System.out.println("AE is coming..");
				ae.printStackTrace();
			}
	}

	public void m3() throws ArithmeticException
	{
		int i = 9/0;
		System.out.println(i);
	}
	
}
