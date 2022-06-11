package interviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum=0;
		int tempNumber = number;
		
		int sumVal =palindormeNumber(tempNumber,sum);
		if(sumVal==number)
		{
			System.out.println("Given number is palindorome "+sumVal);
		}
		else
		{
			System.out.println("Given number is not a palindrome "+sumVal);
		}

	}

	
	public static int palindormeNumber(int tempNumber, int sum)
	{
		while(tempNumber>0)
		{
			int rem = tempNumber%10;
			sum = sum*10+rem;
			tempNumber = tempNumber/10;
		}
			return sum;
		
	}
}
