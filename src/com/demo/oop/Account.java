package com.demo.oop;

public class Account {
	
	int acc_no;
	String name;
	float amount;
    void insert (int acc, String n,float amt)
    {
    	acc_no = acc;
    	name = n;
    	amount = amt;
    }
    void deposit(float amt)
    {
    	amount = amount + amt;
    	System.out.println(amt + " has been deposited ");
    }
    void checkBalance()
    {
    	System.out.println("The Current Balance Is : Rupees" + amount);
    }
    
	void withdraw(float amt)
    {
    	amount = amount - amt;
    	System.out.println(amt + " has been withdrawn ");
    }
    	
	public static void main (String[] args)
	{
		Account a1 = new Account();
		a1.insert(56789, "Sonu", 400000);
		a1.deposit(100000);
		a1.checkBalance();
		a1.withdraw(5000);
		a1.checkBalance();
    }
}