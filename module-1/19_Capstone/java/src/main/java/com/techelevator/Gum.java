package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Product {


	
	private static final String TYPE = "Gum";	
	
	
	public Gum(String slotId, String name, BigDecimal price) {
		super(name, slotId, TYPE, price);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getSound() {
		return " Chew Chew, Yum!";
	}

}
