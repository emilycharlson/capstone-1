package com.techelevator;

import java.math.BigDecimal;

public class Purchase {
	
	private BigDecimal balance = BigDecimal.ZERO;
	
	// ***Feed Money Method***
	// set customer balance equal to input denomination(s)
	// only $1, $2, $5, $10 are accepted
	// currentMoneyProvided = how much money customer put in machine
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public BigDecimal feedMoney(BigDecimal deposit) {
		
		this.balance = this.balance.add(deposit);
		
		
		
		
		return this.balance;
	}
	// ***Select Product***
	
	// create buyProduct()
	
	
	// ***Finish Transaction***
	
	public String finishTransaction() {
		
		this.balance = BigDecimal.ZERO;
		return null; //returns number of quarters, dimes, etc.
}
}
