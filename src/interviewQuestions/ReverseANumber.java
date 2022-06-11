package interviewQuestions;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enyter a number");
		int number = sc.nextInt();
		System.out.println(number);
		int sum=0;
		
		while (number>0) {
			//System.out.println("test");
			int rem = number % 10;
			sum = sum * 10+rem;
			number= number / 10;
                            
		}

		System.out.println("After reversing a number is " + sum);

	}

}
