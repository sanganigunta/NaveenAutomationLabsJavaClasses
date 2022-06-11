package stringAssignment;

import java.util.Arrays;

public class TestSpacesRemoval {

	public static void main(String[] args) {

    String str = "         Hello      Everyone       ";
    String[] arr = str.split(" ");
    System.out.println(Arrays.toString(arr));
    
    //String[] str1 = str.split("\\s+");
//    System.out.println(Arrays.toString(str1));
//   System.out.println(str.length());
//    
//    System.out.println(str.trim());
//    System.out.println(str.length());
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i].isEmpty()) {
          str.replaceAll(" ", "");
    	}
    	System.out.print(arr[i]);
    }
 
	}

}
