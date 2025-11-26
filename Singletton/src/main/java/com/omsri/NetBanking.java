package com.omsri;

public class NetBanking implements Payment {

	@Override
	public void pay(double amt) {
		// TODO Auto-generated method stub
		System.out.println("valid credentials");
		System.out.println("Valid amount entered");
		System.out.println("OTP verified");
		System.out.println("Payment is done by Net Banking for: "+amt);
	}

}
