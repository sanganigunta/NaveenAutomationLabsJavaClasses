package stringConcepts;

public class ReversingString {

	
	public static boolean polindromeString(String str)
	{
		if(str.equals(reversingString(str)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static String reversingString(String str)
	{
		
		if(str==null)
		{
			System.out.println("Not a valid string..........null");
			return null;
		}
		
		String rev="";
		int len = str.length();
		if(len==1)
		{
			return str;
		}
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(reversingString("selenium"));
		System.out.println(reversingString("s"));
		System.out.println(reversingString(null));
		System.out.println(reversingString("1001"));
		System.out.println(polindromeString("malayalam"));
		System.out.println(polindromeString("madam"));
	}

}
