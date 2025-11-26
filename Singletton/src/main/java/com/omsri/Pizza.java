package com.omsri;

public class Pizza {
	private String size;
	private boolean cheese;
	private boolean topping;
	
	private Pizza(Builder builder) {
		this.cheese = builder.cheese; //null
		this.size = builder.size;
		this.topping = builder.topping;
	}
	
	
	
	public static class Builder {
		private String size;
		private boolean cheese;
		private boolean topping;
		
		public Builder(String  pizz) {
			
			this.size = pizz;
			
		}
		
		public Builder cheese(boolean val) {
			this.cheese = val;
			return this;
		}
		
		
		
		
		public Builder topping(boolean val) {
			this.topping = val;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
		
		
	}



	@Override
	public String toString() {
		return "Pizza [size=" + size + ", cheese=" + cheese + ", topping=" + topping + "]";
	}
	


}

