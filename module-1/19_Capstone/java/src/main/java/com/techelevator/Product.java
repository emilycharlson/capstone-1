package com.techelevator;

import java.math.BigDecimal;

public abstract class Product {
	
	//Variables
	private static final int DEFAULT_MAX_QUANTITY = 5;
	private String name;
	private String slotId;
	private String type;
	private BigDecimal price;
	private int quantity;
	
	public Product(String name, String slotId, String type, BigDecimal price) {
		this.name = name;
		this.slotId = slotId;
		this.type = type;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public String getSlotId() {
		return slotId;
	}

	public String getType() {
		String chips;
		String candy;
		String gum;
		String drink;
		return type;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	//Constructor, use name, slot, type, price
	//all getters, quantity uses get/set
	
	
	
}



