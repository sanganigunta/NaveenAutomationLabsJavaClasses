package oOP_SuperKeyword;

public class Company extends State {
	
	String comanyName="wipro";
	public Company()
	{
		System.out.println("Company----------Default constructor");
	}
	
	public Company(String comanyName)
	{
		super(comanyName);
		System.out.println("Company-----------const "+comanyName);
		System.out.println(super.stateName);
	}

	public void getComanyVal()
	{
		System.out.println("Comany method is --------------Headoffice");
		super.getStateVal();
	}
}
