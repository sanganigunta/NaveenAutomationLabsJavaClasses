package javaBasics;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		University_Inheritance u = new University_Inheritance();
		u.BtechBranch();
		u.DegressBranch();
		u.medicalBranch();
		
		System.out.println("##################Child class###########################");
		
		Collage1 c = new Collage1();
		c.BtechBranch(); //Overridden
		c.DegressBranch();//inherited method
		c.medicalBranch();//inherited method
		c.Librari(); //individual method
		
		System.out.println("###################Topcasting####################################");
		//Top/Upcasting
		University_Inheritance u1 = new Collage1();
		
		u1.BtechBranch(); //overriden access the collage class method
		u1.DegressBranch();//inherited
		u1.medicalBranch();//inherited
		
		//Can not access the individual method by using the parent class reference object.
		//It fails to check reference type check
		
		
		//downcasting
		
		Collage1 c2 = (Collage1)new University_Inheritance();
		c2.BtechBranch();
		c2.DegressBranch();
		c2.medicalBranch();
		
		
	}

}
