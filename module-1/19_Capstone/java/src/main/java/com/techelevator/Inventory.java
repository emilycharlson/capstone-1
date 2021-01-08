package com.techelevator;


import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Inventory {
	
	private Map<String, Product> inventory = new LinkedHashMap<String, Product>();
	
	
	public Product getProductFromSlot (String slotId) {
		
		return this.inventory.get(slotId.toUpperCase());
		
	}
	
	
	
}
