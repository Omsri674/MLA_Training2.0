package com.omsri;

public abstract class DrinkMaker {
	
	
	public final void prepareDrink() {
		 boilWater();
		 makeDrink();
		 addExtras();
		 serveDrink();
	}
	
	

	void boilWater() {
		
	}
	abstract void makeDrink();
	abstract void addExtras();
	void serveDrink() {
		
	}
}
