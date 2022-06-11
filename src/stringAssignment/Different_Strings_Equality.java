package stringAssignment;

public class Different_Strings_Equality {

	public static void main(String[] args) {
		
		String str1="testing selenium";
		String str2 = "testing selenium";
//		if(str1.equals(str2))
//		{
//			System.out.println("Two string are equal");
//		}
//		else
//		{
//			System.out.println("Two strings are not equal");
//		}
//		
//		if(str1==str2)
//		{
//			System.out.println("Two string are equal");
//		}
//		else
//		{
//			System.out.println("Two strings are not equal");
//		}
		
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Two string are equal");
		}
		else
		{
			System.out.println("Two strings are not equal");
		}

	}

}
