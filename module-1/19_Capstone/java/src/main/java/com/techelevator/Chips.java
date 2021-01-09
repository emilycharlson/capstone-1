package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Product {
	public Chips(String name, String slotId, String type, BigDecimal price) {
		super(name, slotId, type, price);
		// TODO Auto-generated constructor stub
	}
	private static final String TYPE = "chips";

	@Override
	public String getType() {
		return this.type;
	}


}
