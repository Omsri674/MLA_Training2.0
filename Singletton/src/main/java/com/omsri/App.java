package com.omsri;

public class App  {
	public static void main(String[] args) {
		
//		//Singleton class
//		DBConnection conn1 = DBConnection.getInstance();
//		DBConnection conn2 = DBConnection.getInstance();
//		System.out.println(conn1.hashCode() +"\n"+ conn2.hashCode());
		
		
		
//		Shapes s = ShapeFactory.getShapes("Square");
//		s.draw();
//		System.out.println();
//		Shapes c = ShapeFactory.getShapes("Circle");
//		c.draw();
//		System.out.println();
//		Shapes r  =  ShapeFactory.getShapes("Rectangle");
//		r.draw();
		
		
		
//		Builder Pattern
//		Pizza pizz = new Pizza.Builder("medium")
//				.cheese(false).topping(true).build();
//		
//		Pizza pizz2 = new Pizza.Builder("small")
//				.cheese(true).build();
//		System.out.println(pizz2.toString());
//		
//		
//		DrinkMaker tea = new TeaMaker();
//		tea.makeDrink();
//		
//		
//		
//		
//		Video youtube1 = new YouTube(new UltraHDQuaity());
//		youtube1.playVideo();
//		
//		Video youtube2 = new YouTube(new FdhQuality());
//		youtube2.playVideo();
//		
//		Video hotstar = new Hotstar(new UltraHDQuaity());
//		hotstar.playVideo();
//		
//		Video prime = new Prime(new HDQuality());
//		prime.playVideo();
//		
//		System.out.println();
//		System.out.println();
		Payment netpayment = new NetBanking();
		netpayment.pay(521000);
		System.out.println();
		Payment upi = new Upi();
		upi.pay(45000);
		
	}

	
}
