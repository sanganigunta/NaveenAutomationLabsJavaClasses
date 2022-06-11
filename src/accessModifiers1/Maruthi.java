package accessModifiers1;



import accessModifiers.Car1;

public class Maruthi extends Car1 {

	
	public static void main(String args[])
	{
		Maruthi b = new Maruthi();
		b.color="Green";
		
		b.modal="1234";
		
		System.out.println(	b.color);
		
		System.out.println(b.modal);
		
		b.Test();
		b.Speed();
		
	}
}
