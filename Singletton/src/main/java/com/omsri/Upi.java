package com.omsri;

public class Upi implements Payment {
	private CashPayment cashPayment = new CashPayment();

	@Override
	public void pay(double amt) {
		// TODO Auto-generated method stub
		System.out.println("valid credentials");
		System.out.println("Valid amount entered");
		System.out.println("Valid pin");
		System.out.println("Payment is done by UPI for: "+amt);
	}
	
	

}
