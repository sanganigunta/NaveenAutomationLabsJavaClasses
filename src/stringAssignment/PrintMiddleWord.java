package stringAssignment;

public class PrintMiddleWord {

	public static void main(String[] args) {

    String str ="Hello Java Selenium test training";
    String[] str1 = str.split(" ");
    int len =  str1.length;
    int halflen = len/2;
    System.out.println(halflen);
    System.out.println(str1[halflen]);
    

	}

}
