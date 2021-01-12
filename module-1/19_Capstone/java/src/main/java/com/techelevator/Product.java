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
	
	//constructor
	public Product(String slotId, String name, String type, BigDecimal price) {
		this.name = name;
		this.slotId = slotId;
		this.type = type;
		this.price = price;
		this.quantity = DEFAULT_MAX_QUANTITY;
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

	public abstract String getSound();
	

	public BigDecimal getPrice() {
		return price;
	}
	
	//Constructor, use name, slot, type, price
	//all getters, quantity uses get/set
	
	
	
}



