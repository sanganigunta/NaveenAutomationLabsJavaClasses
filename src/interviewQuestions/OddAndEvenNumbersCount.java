package interviewQuestions;

public class OddAndEvenNumbersCount {

	public static void main(String[] args) {
		printEvenAndOddNumbersCount(60924);

	}

	public static void printEvenAndOddNumbersCount(int number)
	{
		int evenCount=0;
		int oddCount=0;
		while(number>0)
		{
			int rem = number%10;
			if(rem%2==0) {
				evenCount=evenCount+1;
			}
			else {
				oddCount=oddCount+1;
			}
			
			number = number/10;
		}
		
		System.out.println("Even numbers count is "+evenCount);
		System.out.println("Odd numbers count is "+oddCount);
	}
}
