package exceptionHandling;

public class TryCatchConcepts {

	String  name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int i = 9/3;
		System.out.println(i);
		String s ="100A";
		int j = Integer.parseInt(s);
		System.out.println(j);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception is coming.."+ae);
			ae.printStackTrace();
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("NumberformatException is coming.."+nfe);
			nfe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
