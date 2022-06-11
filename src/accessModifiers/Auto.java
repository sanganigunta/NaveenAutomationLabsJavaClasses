package accessModifiers;

public class Auto {
	
	
	public static void main(String args[])
	{
		Car1 c = new Car1();
		c.color="Green";
		c.modal="12345";
		c.price=1000;
		
		System.out.println(c.color);
		System.out.println(c.modal);
		System.out.println(c.price);
		
		c.Dirve();
		c.Test();
		c.Speed();
		
	}
	
	
	
}
