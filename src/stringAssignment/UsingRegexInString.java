package stringAssignment;

public class UsingRegexInString {

	public static void main(String[] args) {

		String s = "your transaction id is: 12345 and reference id is 34567";
		s = s.replaceAll("[^0-9]", "");
		System.out.println(s);

	}

}
