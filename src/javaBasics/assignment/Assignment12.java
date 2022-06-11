package javaBasics.assignment;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n1 = s.nextInt();
	
		System.out.println("Enter a number");
		int n2 = s.nextInt();
		System.out.println("Enter a number");
		int n3 = s.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("The greatest number is "+n1);
		}
		
		else if(n2>n3 && n2>n1)

		{
			System.out.println("The greatest number is "+n2);
		}
		
		else
		{
			System.out.println("Greatest number is "+n3);
		}
		
		
		
		

	}

}
