package javaBasics.assignment;

public class Assignment21 {
	int factNumber=1;
	
	public int factorialNumber(int number)
	{
		System.out.println("Entered number is "+number);
		
		 
		for(int i=1;i<=number;i++)
		{
			factNumber = factNumber*i;
			
		}
		
		return factNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment21 assign = new Assignment21();
		int fact = assign.factorialNumber(10);
		System.out.println("Factorial of a number is "+fact);
		
	}

}
