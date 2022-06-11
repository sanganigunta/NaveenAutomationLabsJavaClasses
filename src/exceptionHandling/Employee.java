package exceptionHandling;

public class Employee extends Student {
	
	String name;
	public void finalize()
	{
		System.out.println("Employee.........finalize");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e = null;
		
		
		System.gc();
		//System.out.println(e.name);
		
		Student s = new Student();
		s=null;
		
		System.gc();
		//System.out.println(s.age);
	}

}
