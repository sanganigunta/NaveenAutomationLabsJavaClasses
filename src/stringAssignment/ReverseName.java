package stringAssignment;

public class ReverseName {

	public static void main(String[] args) {
		
		String name="Divya sanganigunta";
		
		String reverString="";
		
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			reverString = reverString+name.charAt(i);
//		}
//		System.out.println(reverString);
		
		
		char[] name1 = name.toCharArray();
		
		for(int i=name1.length-1;i>=0;i--)
		{
			reverString= reverString+name1[i];
		}
		System.out.println(reverString);
		
		
	}	

}
