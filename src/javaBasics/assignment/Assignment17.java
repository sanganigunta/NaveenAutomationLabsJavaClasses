package javaBasics.assignment;

public class Assignment17 {

	int sum;
	int product;
	double area;
	double circumference;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int addition = addTwoNumbers(30,40);
		System.out.println("Addition of 2 numbers is "+addition);
		
		Assignment17 assign = new Assignment17();
		int prod = assign.productTwoNumbers(10, 20);
		System.out.println("Product of 2 numbers is "+prod);
		
		assign.AreaOfACircle(2);
		assign.circumferenceOfCircle(4);
	}

	
	public static int addTwoNumbers(int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	
	public int productTwoNumbers(int num1, int num2)
	{
		product = num1*num2;
		return product;
	}
	
	// Area = πr2
	//circumference=2πr
	
	public double AreaOfACircle(int radius)
	{
		area = Math.PI*(radius*radius);
		System.out.println("Aread of circle is "+area);
		return area;
	}
	
	
	
	public double circumferenceOfCircle(int radius)
	{
		circumference = (2*Math.PI)*radius;
		System.out.println("circumference of a circle is "+circumference);
		return circumference;
	}
	
	
	
}
