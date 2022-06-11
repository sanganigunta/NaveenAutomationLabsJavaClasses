package programes;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 525;
		int temp = num;
		int rever_num = reverseNumber(num);
		System.out.println(rever_num);
		
		if(temp ==rever_num)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}

	}
	
	public static int reverseNumber(int num)
	{
		int rem =0;
		int sum =0;
		while(num>0)
		{
			 rem = num%10;
			 sum = sum*10 +rem;// 5 50+4 540+3 5430+2 5432
			 num = num/10;
			
		}
		
		return sum;
	}

}
