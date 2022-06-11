package stringAssignment;

public class LastAndFirstCharacterInAWord {

	public static void main(String[] args) {


		String str ="selenium";
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		System.out.println(firstChar+":"+lastChar);

	}

}
