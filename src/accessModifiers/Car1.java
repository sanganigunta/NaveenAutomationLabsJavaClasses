package accessModifiers;

public class Car1 {

	int price;
	public String color;
	protected String modal;
	private int licenceNumber;
	

	public void Speed() {
		System.out.println("Speed of the car ");
	}

	
	
	private void Milage() {
		System.out.println("Milage of the car ");
	}

	void Dirve() {
		System.out.println("Dirve of the car ");
	}

	protected void Test() {
		System.out.println("Test of the car ");
	}
	
	public static void main(String args[])

	{
		Car1 c = new Car1();
		c.color = "blue";
		c.licenceNumber=1234;
		c.modal="BMW";
		c.price =1000;
		System.out.println(c.color);
		System.out.println(c.licenceNumber);
		System.out.println(c.modal);
		System.out.println(c.price);
	}
}
