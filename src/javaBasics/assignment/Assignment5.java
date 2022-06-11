package javaBasics.assignment;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =1;
		while(i<=10)
		{
			System.out.println(i);
			if(i%7==0)
			{
				System.out.println("Number is multiple of 7");
				break;
			}
			i++;
		}
	}

}
