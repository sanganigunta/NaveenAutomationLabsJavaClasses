package interviewQuestions;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str ="mam";
		String temStr = str;
		String palindromeString = palindorme(temStr);
		
		if(str.equals(palindromeString))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("Strings are not palindrome");
		}
		
		
	}
	
	public static String palindorme(String str)
	{
		String rev="";
		if(str==null)
		{
			return null;
		}
		else if(str.isEmpty())
		{
			return "empty";
		}
		else 
		{
			int len = str.length();
			for(int i =len-1;i>=0;i--)
			{
				rev = rev+str.charAt(i);
			}
			
		}
		
		return rev;
		
	}

}
