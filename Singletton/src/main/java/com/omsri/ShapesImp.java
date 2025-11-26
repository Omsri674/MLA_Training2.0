package com.omsri;

 class Circle  implements Shapes{

	@Override
	public void draw() {
		System.out.println("Circle is drawn");
		
	}

}

 class Rectangle implements Shapes{

	@Override
	public void draw() {
		System.out.println("Rectangle is drawn");
	}
	 
	 
 }
 
 class Square implements Shapes{

	@Override
	public void draw() {

		System.out.println("Square is drawn");
	}
	 
 }