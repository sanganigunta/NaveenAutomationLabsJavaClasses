package stringAssignment;

public class Print3EFromString {

	public static void main(String[] args) {

    String str = "Welcome to Naveen Automation Labs !";
    int firstindex =  str.indexOf('e');
    System.out.println(firstindex);
    int secondIndex = str.indexOf('e',firstindex+1);
    System.out.println(secondIndex);
    int thirdIndex = str.indexOf('e', secondIndex+1);
    System.out.println(thirdIndex);
    
	}

}
