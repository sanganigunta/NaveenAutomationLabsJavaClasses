package stringConcepts;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to selenium training to";
		System.out.println("Lowest index is "+0);
		System.out.println("Highest index is "+str.length());
		
		//ChartAt()==> Getting the index of specific character
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.charAt(12));
		
		//indexof will get the index
		
		System.out.println(str.indexOf('e'));//first occurence
		int n1 = str.indexOf('e');
		System.out.println(n1);
		int n2 = str.indexOf('e',n1+1);
		System.out.println(n2);
		int n3 = str.indexOf('e', n2+1);
		System.out.println(n3);
		
		System.out.println(str.indexOf("to"));
		
		int nm = str.indexOf("to");
		System.out.println(str);
		System.out.println(str.indexOf("to", str.indexOf("to")+1));
	
		String test ="welcome admin";
		if(test.indexOf("admin")>0)
		{
		System.out.println("Admin is present");
		}
		else
		{
			System.out.println("Admin is not present");
		}
		
		System.out.println(test.contains("welcome"));
		
		String test1="welcome admin";
		if(test==test1)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		String test2 = new String("welcome admin");
		if(test==test2)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		System.out.println(test.endsWith(test2));
		System.out.println(test.equals(test1));
		
		String s1 ="         hello selenium         ";
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase().trim());
		System.out.println(s1.toUpperCase().trim());
		
		String s2 = "Welcome_Selenium_Java_TestNG_Traning_FEB_Batch";
		String str1[] =s2.split("_");
		System.out.println(Arrays.toString(str1));
		
		String s3 = "xXSeleniumxxXXJAVAXXxTraining";
		String str2[] = s3.split("xX");
		System.out.println(str2[0]);
		System.out.println(Arrays.toString(str2));
		
		String date ="21-9-2022";
		System.out.println(date.replace("-", "/"));
		System.out.println(date);//String is immutable

	}

}
