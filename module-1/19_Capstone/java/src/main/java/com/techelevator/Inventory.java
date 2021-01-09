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
	
	
<<<<<<< HEAD
	
=======
	public Product getProductFromSlot (String slotId) {
		
		return this.inventory.get(slotId.toUpperCase());
		
	}
>>>>>>> 9ae0ea09c0c3ec13f07076ab604e79bf4134b87b
	
	
	
}
