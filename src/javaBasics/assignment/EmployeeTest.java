package javaBasics.assignment;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		emp.setStringName("Divya");
		emp.setAge(26);
		emp.setSalary(7.8);
		emp.setIsActive(true);
		emp.setGender('F');
		
		String empinfo = emp.getEmployeeInfo();
		System.out.println(empinfo);
	}

}
