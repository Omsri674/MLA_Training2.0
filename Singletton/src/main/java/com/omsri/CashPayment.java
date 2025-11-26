package com.omsri;

public class CashPayment implements Payment {

	@Override
	public void pay(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Payment is done by cash for: "+amt);
	}

}
