package stringAssignment;

public class BreakStringAndPrint {

	public static void main(String[] args) {
		//String str = "Welcome to Naveen Automation Labs";
		String str = "Welcome_to_Java_Selenium_Automation_Labs";
		//String spliVal ="\s";
		String spliVal ="_";
		String str1[] = str.split(spliVal);
		
//		System.out.println(str1[0]);
//		System.out.println(str1[1]);
//		System.out.println(str1[2]);
//		System.out.println(str1[3]);
//		System.out.println(str1[4]);
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}

		
	}

}
