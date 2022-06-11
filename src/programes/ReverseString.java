package programes;

public class ReverseString {

	public static void main(String[] args) {
		
		String str ="malayalam";
		String reverse = getReverseString(str);
		System.out.println(reverse);
		
		if(str.equals(reverse))
			System.out.println("Palindorme "+reverse);
		else
			System.out.println("Not palindrome "+reverse);

	}
	
	public static String getReverseString(String str)
	{
		String rev ="";
		 for(int i=str.length()-1;i>=0; i--)
		 {
			 rev = rev+str.charAt(i);
			
		 }
		return rev;
	}

}
