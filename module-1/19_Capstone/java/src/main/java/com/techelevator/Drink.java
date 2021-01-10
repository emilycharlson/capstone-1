package com.techelevator;

import java.math.BigDecimal;

public class Drink extends Product {


	
	private static final String TYPE = "Drink";	
	
	
	public Drink(String slotId, String name, BigDecimal price) {
		super(name, slotId, TYPE, price);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getSound() {
		return " Glug Glug, Yum!";
	}


}
