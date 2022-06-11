package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String str ="selenium";
		String rev ="";
//		int len = str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev = rev+str.charAt(i);
//		}
		
//		System.out.println("After reversing the string is "+rev);
	
//		char[] arr = str.toCharArray();	
//		int len = arr.length;
//		for(int i=len-1;i>=0;i--)
//		{
//			rev = rev+arr[i];
//		}
//
//		System.out.println(rev);
		
		
		StringBuilder str1 = new StringBuilder(str);
		rev = rev+str1.reverse();
		System.out.println(rev);
	}

}
