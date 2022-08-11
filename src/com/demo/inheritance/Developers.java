package com.demo.inheritance;

class Employee {
	int id;
	float basesalary = 5000;
}
class HR extends Employee {
	int Bonus = 10000;
	void TotalPayment() {
		System.out.println( "total payment: "+ (basesalary + Bonus));
	}
}
public class Developers extends Employee {
	int bonus = 15000;
	public static void main (String args []) {
		HR h1 = new HR();
		h1.TotalPayment();
		Developers d1 = new Developers();
		System.out.println("Developers base salary is :"+ d1.basesalary);
		System.out.println("Developers bonus is: "+ d1.bonus);
		System.out.println("Developers total payment is " + (d1.bonus + d1.basesalary));
	}
}