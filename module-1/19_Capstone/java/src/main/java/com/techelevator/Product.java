package com.techelevator;

import java.math.BigDecimal;

public class Product {
	
	//Variables
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
		return type;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	//Constructor, use name, slot, type, price
	//all getters, quantity uses get/set
	
	
	
}



