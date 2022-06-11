package javaBasics.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> color = new ArrayList<String>();
      
      color.add("Green");
      color.add("white");
      color.add("Blue");
      color.add("Yellow");
      System.out.println(color);
      
      color.add(0, "Pink");
      System.out.println(color);
      color.add(color.size(),"Sky Blue");
      System.out.println(color);
      int color_Index = color.indexOf("Blue");
      System.out.println(color.get(1));
      System.out.println(color.get(4));
     System.out.println(color.get(2));
     System.out.println("Update...............");
     color.add(1, "text");
     System.out.println(color);
     System.out.println("Remove an element...............");
     color.remove(3);
     System.out.println(color);
     
     ArrayList<Integer> ar = new ArrayList<Integer>();
     ar.add(100);
     ar.add(200);
     ar.add(300);
     ar.add(400);
     ar.add(500);
     for(int i= 0;i<ar.size();i++)
     {
    	System.out.println(ar.get(i));
    	if(ar.get(i)==300)
    	{
    		ar.remove(i);
    	}
     }
     
     System.out.println(ar.contains(700));
     Collections.reverse(ar);
     System.out.println(ar);
     System.out.println(ar.get(2));
     
     System.out.println("Portion of a string........");
     ar.subList(1, 3);
     System.out.println(ar.subList(1, 3));
     ar.removeAll(ar);
     System.out.println(ar);
     
     ar.add(10);
     ar.add(20);
     ar.add(30);
     ar.add(40);
     ar.add(50);
     ar.add(60);
     Collections.swap(ar, 2, 5);
     System.out.println(ar);
     
     
	}

	

}
