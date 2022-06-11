package com.java.inheritance;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("##################GrandParent class#####################");
		
		Bank b = new Bank();
		b.openingAccount();
		b.closingAccount();
		b.updateAccount("Salary");
		
		
		System.out.println("##################Parent class#####################");
		System.out.println("");
		Account a = new Account();
		
		a.amountDeposite();
		a.amountWithDrawal();
		a.openingAccount();
		a.closingAccount();
		a.updateAccount("Savings");
		
		System.out.println("##################Savings Child class#####################");

		SavingsAccount sa = new SavingsAccount();
		sa.openingAccount();
		sa.closingAccount();
		sa.updateAccount("Savings");
		sa.amountDeposite();
		sa.amountWithDrawal();
		int in = sa.interestRate;
		System.out.println(in);
		sa.interestRate();
		
		
		System.out.println("###############Top Casting###################");
		Account a1 = new SavingsAccount();
		a1.openingAccount();
		a1.closingAccount();
		a1.updateAccount("savings");
		a1.amountDeposite();
		a1.amountWithDrawal();
		//individual method of savings account is not accesiable.
		
		
		
		System.out.println("##################Current Child class#####################");
		
		CurrentAccount ca = new CurrentAccount();
		ca.openingAccount();
		ca.closingAccount();
		ca.updateAccount("Savings");
		ca.amountDeposite();
		ca.amountWithDrawal();
		int o = ca.overdraft_limit;
		System.out.println(o);
		
	}

}
