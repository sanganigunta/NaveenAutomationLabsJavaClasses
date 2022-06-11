package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int i = 9/0;
		throw new ArithmeticException("/ zero test");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming.."+ae);
			ae.printStackTrace();
			
		}
		

	}

}
