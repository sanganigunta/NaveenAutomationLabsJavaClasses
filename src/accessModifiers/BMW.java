package accessModifiers;

public class BMW extends Car1{
	
	public static void main(String args[])
	{
		BMW b = new BMW();
		b.color="Blue";
		b.modal="1234";
		b.price=1000;
		
		b.Dirve();
		b.Speed();
		b.Test();
		
		System.out.println(b.color);
		System.out.println(b.modal);
		System.out.println(b.price);
		
	}
	
	
}
