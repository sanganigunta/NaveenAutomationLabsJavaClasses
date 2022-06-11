import java.util.ArrayList;
import java.util.Arrays;

public class MethodsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> empDevices = ListDevices("Divya");
		System.out.println(empDevices);
		String[] ar = companyDeptName("wipro");
		System.out.println(Arrays.toString(ar));

	}

	public static String[] companyDeptName(String companyName)
	{
		System.out.println("Company name is "+companyName);
		
		String[] arr = new String[5];
		if(companyName.equals("IBM"))
		{
			arr[0] = "HR";
			arr[1] = "Admin";
			arr[2] = "Finance";
		}
		
		else if(companyName.equals("TCS"))
		{
			arr[0] = "HR";
			arr[1] = "Admin";
			arr[2] = "Finance";
			arr[3] = "Project";
			arr[4] = "Recruitement";
			
		}
		
		else
		{
			System.out.println("Company not found "+companyName);
		}
		
		return arr;
	}

	
	
	public static ArrayList<String> ListDevices(String empName)
	{
		System.out.println("Employee name is: "+ empName);
		ArrayList<String> devList = new ArrayList<String>();
		if(empName.equals("Krushna"))
		{
			devList.add("iphone12");
			devList.add("iphone13");
			devList.add("iphone14");
			devList.add("iphone15");
		}
		else if(empName.equals("Radha"))
		{
			devList.add("sam12");
			devList.add("sam13");
			devList.add("sam14");
			devList.add("sam15");
		}
		
		else
		{
			System.out.println("No employee found "+empName);
		}
		
		return devList;
	}
}
