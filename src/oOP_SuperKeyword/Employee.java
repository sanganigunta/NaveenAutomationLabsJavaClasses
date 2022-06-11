package oOP_SuperKeyword;

public class Employee extends Company{

	String eName= "Krushna";
	public Employee()
	{
		System.out.println("Employee------------default constrctor");
	}
	
	public Employee(String empName, int empId)
	{
		super(empName);
		System.out.println("Employee------------ constrctor "+empName+" "+empId);
		System.out.println(super.comanyName);
	}
	
	public void getEmployeeVal()
	{
		
		System.out.println("Employee method is --------------Software");
		super.getComanyVal();
	}
}
