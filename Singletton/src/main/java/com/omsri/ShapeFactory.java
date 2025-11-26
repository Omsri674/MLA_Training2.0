
package com.omsri;

public class ShapeFactory {
	
	public static Shapes getShapes(String type) {
		
		switch(type) {
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		case "Square":
			return new Square();
			
		default:
			return null;
		
		}
	}

}
