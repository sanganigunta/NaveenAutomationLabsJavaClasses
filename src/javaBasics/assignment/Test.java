package javaBasics.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] plugin = new String[4];
//		plugin[0]="test";
//		plugin[1]="constructor";
//		plugin[2]="plugin";
//		plugin[3]="string";
//		Browser br = new Browser("Selenium", 4.0, plugin);
//		System.out.println(br.getName()+" "+br.getVersion()+" "+Arrays.toString(plugin));
//		br.setName("Appium");
//		br.setVersion(4.2);
//		
//		plugin[0]="test";
//		plugin[1]="enacpsulation";
//		plugin[2]="plugin";
//		plugin[3]="string";
//		
//		System.out.println(br.getName()+" "+br.getVersion()+" "+Arrays.toString(plugin));
//		

		
		University us = new University("SVU");
		System.out.println(us.getName());
		
		University us1 = new University("SVV","India");
		System.out.println(us1.getName()+" "+us1.getCountry());
		University us2 = new University("SVW", "India","1/12/1965");
		System.out.println(us2.getName()+" "+us2.getCountry()+" "+us2.getEstablishedDate());
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("BSC");
		courses.add("BE");
		courses.add("BTech");
		courses.add("MTech");
		
		University us3 = new University("SVX", "India", "1/12/1945", courses);
		System.out.println(us2.getName()+" "+us2.getCountry()+" "+us2.getEstablishedDate()+" "+us3.courses());
	}

}
