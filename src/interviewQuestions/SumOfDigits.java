package interviewQuestions;

public class SumOfDigits {

	public static void main(String[] args) {
		

		printSumOfDigits(1879);
	}
	
	public static void printSumOfDigits(int number)
	{
		int sum=0;
		if(number<10)
		{
			System.out.println("sum of the number is "+number);
		}
		else {
		while(number>0)
		{
			int rem = number%10;
			sum = sum+rem;
			number = number/10;
		}
		System.out.println("Sum of digits is "+sum);
		}
		
	}

}
