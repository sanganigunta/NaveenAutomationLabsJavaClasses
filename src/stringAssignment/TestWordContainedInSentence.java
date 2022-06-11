package stringAssignment;

public class TestWordContainedInSentence {

	public static void main(String[] args) {


		String str ="learning selenium automation testing";
		String test="selenium";
//		if(str.indexOf(test)!=-1)
//		{
//			System.out.println("String contains the word");
//		}
//		else
//		{
//			System.out.println("String does not contain the word");
//		}
		
		if(str.contains(test))
		{
			System.out.println("String contains the word");
		}
		else
		{
			System.out.println("String does not contain the word");
		}

	}

}
