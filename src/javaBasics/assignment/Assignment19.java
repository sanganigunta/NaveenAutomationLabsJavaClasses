package javaBasics.assignment;

public class Assignment19 {
	
	int min;
	public int minValue(int arr[])
	{
		System.out.println("The minimum number of the array is ");
		min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		
		return min;
		
	}
	
	public void IdentifyEvenOdd(int num)

	{
		System.out.println("Entered number is "+num);
		if(num%2==0)
		{
			System.out.println("Given number is even "+num);
		}
		else
		{
			System.out.println("Given number is odd "+num);
		}
		 
	}
	
	public void voteEligilibilityCriteria(int age)
	{
		System.out.println(" The person age is "+age);
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {100,5,6,90,2,1000};
		Assignment19 assign = new Assignment19();
//		int mn =assign.minValue(arr1);
//		System.out.println(mn);
		//assign.IdentifyEvenOdd(-1);
		assign.voteEligilibilityCriteria(200);
	

	}

}
