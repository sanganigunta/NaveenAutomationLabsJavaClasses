package javaBasics.assignment;

public class Assignment22 {

	
	public int primeNumber(int number)
	{
		System.out.println("Entered number is "+number);
		boolean flag= false;
		for(int i=2;i<number;i++)
		{
			if(number%2==0)
			{
				flag = false;
			}
			else
			{
				flag = true;
			}
		}
		
		if(flag)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment22 assign = new Assignment22();
		assign.primeNumber(29);

	}

}
