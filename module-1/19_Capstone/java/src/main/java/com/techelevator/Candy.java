package com.techelevator;

import java.math.BigDecimal;


public class Candy extends Product {
	
	private static final String TYPE = "Candy";	
	
	
	public Candy(String name, String slotId, BigDecimal price) {
		super(name, slotId, TYPE, price);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getSound() {
		return " Munch Munch, Yum!";
	}

}
