package stringAssignment;

public class GetLastHalfString {

	public static void main(String[] args) {


		String str ="Welcome to java and selenium training";
		int len = str.length();
     	int halflen = len/2;
//		System.out.println(len+":"+halflen);
//		String lasthalftext = "";
//		
//		for(int i=halflen;i<len;i++)
//		{
//			lasthalftext=lasthalftext+str.charAt(i);
//		}
//
//		System.out.println(lasthalftext);
		
		String lasthalftext = str.substring(halflen, len);
		System.out.println(lasthalftext);
	}

}
