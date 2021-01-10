package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Product {
	
	private static final String TYPE = "Chips";	
	
	
	public Chips(String slotId, String name, BigDecimal price) {
		super(name, slotId, TYPE, price);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getSound() {
		return " Crunch Crunch, Yum!";
	}

}
