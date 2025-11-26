package com.omsri;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      
    	
    	System.out.println("Immutable class creation");
    	
    	System.out.println("1.class need to be final \n 2. properties need to be final\n 3."
    			+ "properties need to get value only through constructor"
    			+ "\n 4. No setter to chnage the value");
    	
    	
    	System.out.println();
    	Person p1 = new Person("Kavia", 1435143143);
    	System.out.println(p1.toString());
    	
    }
}
