package javaBasics.assignment;



public class Assignment18 {

	static int min;
	static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {100,5,6,90,2,1000};
	
		int mn = minNumber(arr1);
		System.out.println("min number is "+mn);
	    
//		int mx = maxNumber(arr1);
//		System.out.println(mx);

	}
	
	public static int maxNumber(int[] arr)
	{
		System.out.println("Max number is ");
		max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int minNumber(int[] arr)
	{
		//System.out.println("Array entered by user is "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			min = arr[0];
			//System.out.println(arr[i]);

			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}

}
