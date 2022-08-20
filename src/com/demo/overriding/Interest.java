package com.demo.overriding;

public class Interest {
	public static void main(String[] args) {
		// creating an instance of the child class
		J Interest = new Interest();

		// calling the method with child class instance
		deposit.run();
	}

} // parent class ends

class Bank { // this is my parent class

	void run() // this is a method which is defined in my parent class
	{
		System.out.println("Kotak, Axis, HDFC, SBI");
	}

	public class Interest extends Bank {

		// defining the same method which is present in my parent class
		void run() {
			System.out.println("If i deposit 1 lakh rupees ");
		}

	}
}
