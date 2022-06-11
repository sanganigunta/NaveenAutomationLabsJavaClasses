package interviewQuestions;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		getlargestNumber();

	}
	
	public static void getlargestNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int f1 = sc.nextInt();
		System.out.println("Enter second number");
		int f2 = sc.nextInt();
		System.out.println("Enter third number");
		int f3 = sc.nextInt();
		
		if(f1<0 || f2<0 || f3<0) {
		System.out.println("Please enter all values only above 1");
		}
		else if(f1==0 && f2==0 &&f3==0) {
			System.out.println("All given numbers are "+f1);
		}
		else if(f1>f2 && f1>3)
		{
			System.out.println(f1+ " is largest");
		}
		else if(f2>f1 && f2>f3)
		{
			System.out.println(f2+" is largest");
		}
		else
		{
			System.out.println(f3+ " is largest");
		}
	}
	

}
