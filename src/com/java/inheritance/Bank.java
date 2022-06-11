package com.java.inheritance;

public class Bank {
	
	public void openingAccount()
	{
		System.out.println("Open an account");
	}
	
	public void closingAccount()
	{
		System.out.println("Closing the account");
	}
	
	public void updateAccount(String accountType)
	{
		System.out.println("The given account type is "+accountType);
	  if(accountType.equals("Savings"))
	  {
		  System.out.println("Update the interest rate of the bank");
	  }
	  else if(accountType.equals("Current"))
	  {
		  System.out.println("Update overdraft limit");
	  }
	  
	  else if(accountType.equalsIgnoreCase("Salary"))
	  {
		  System.out.println("Update current salary");
	  }
	  
	  else if(accountType.equals("Business"))
	  {
		  System.out.println("Update current year profit of the business");
	  }
	  
	  else
	  {
		  System.out.println("No account type is found");
	  }
		
	}
	public static void main(String args[])
	{
	
	String[] account = new String[4];
	
	account[0] = "Savings";
	account[1] = "Current";
	account[0] = "Salary";
	account[0] = "Business";
}

}