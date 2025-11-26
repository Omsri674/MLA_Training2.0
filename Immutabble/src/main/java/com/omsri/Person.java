package com.omsri;

public final class Person {

	private final String name;
	private final long uid;
	
	
	
	public Person(String name, long uid) {
		super();
		this.name = name;
		this.uid = uid;
	}



	public String getName() {
		return name;
	}



	public long getUid() {
		return uid;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", uid=" + uid + "]";
	}
	
	
	
	
}
