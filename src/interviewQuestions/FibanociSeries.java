package interviewQuestions;

public class FibanociSeries {

	public static void main(String[] args) {
		printFibanociSeries(5);
		

	}
	
	public static void printFibanociSeries(int iterations)
	{
		
		int sum =0;
		int num1 =0; 
		int num2 =1;
		int num3=0;
		System.out.print(num1+" "+num2);
		
		for(int i=2;i<=iterations;i++)
		{
			sum = num1+num2;
			//System.out.println(sum);
			num1 =num2;
			num2 = sum;
			System.out.print(" "+sum);
		}
		
	}

}
