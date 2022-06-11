package exceptionHandling;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(testFinally());
		

	}
	
	public static int testFinally()
	{
		try
		{
			int i=9/3;
			System.out.println(i);
			System.exit(1);
			return 20;
			
		}catch(ArithmeticException ae)
		{
			System.out.println("ae is coming");
			ae.printStackTrace();
			return 40;
		}finally
		{
			System.out.println("test");
			return 100;
		}
	}

}
