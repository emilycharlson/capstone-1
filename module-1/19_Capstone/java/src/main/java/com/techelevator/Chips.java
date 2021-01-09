package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Product {
	
	private static final String TYPE = "Chips";	
	
	
	public Chips(String name, String slotId, BigDecimal price) {
		super(name, slotId, TYPE, price);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getSound() {
		return " Crunch Crunch, Yum!";
	}
<<<<<<< HEAD


=======
	
>>>>>>> 9ae0ea09c0c3ec13f07076ab604e79bf4134b87b
}
