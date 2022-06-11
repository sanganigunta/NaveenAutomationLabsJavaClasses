package javaBasics.assignment;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		if(n>0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}

}
