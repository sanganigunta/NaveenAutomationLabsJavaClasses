package interviewQuestions;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {
		int numberOFDigits = printNumberOfDigitsInANumber(0);
		System.out.println(numberOFDigits);

	}

	public static int printNumberOfDigitsInANumber(int number)
	{
		int count =0;
		if(number==0) {
			System.out.println("Given number is 0");
		}
		
		while(number!=0)
		{
			number = number/10;
			count++;
		}
				
		return count;
	}
}
