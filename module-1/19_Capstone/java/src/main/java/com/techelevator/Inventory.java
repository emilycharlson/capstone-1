package com.techelevator;


import java.io.PrintWriter;
import java.math.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.techelevator.Product;

public class Inventory {
	
	 
	protected Product convertLineIntoInventory(String line) {
		String[] itemSplit = line.split("|");
		
		String slotIdIndex = itemSplit[0].trim();
		String itemNameIndex = itemSplit[1].trim();
		String priceIndex = itemSplit[2].trim();
		String typeIndex = itemSplit[3].trim();
		
		BigDecimal priceConversion = new BigDecimal(priceIndex);
		
		if(typeIndex.equalsIgnoreCase("chips")) {
			return new Chips(slotIdIndex, itemNameIndex, priceConversion);
		} else if (typeIndex.equalsIgnoreCase("drink")) {
			return new Drink(slotIdIndex, itemNameIndex, priceConversion);
		} else if (typeIndex.equalsIgnoreCase("gum")) {
			return new Gum(slotIdIndex, itemNameIndex, priceConversion);
		} else if (typeIndex.equalsIgnoreCase("candy")) {
			return new Drink(slotIdIndex, itemNameIndex, priceConversion);
		} else {
			return null;
	}
	}

	private Map<String, Product> loadInventory() {
	
	 Map<String, Product> inventory = new LinkedHashMap<String, Product>();
	
	 try(Scanner scanner = new Scanner("vendingmachine.csv")) {
		 int lineNumber = 1;
		 while(scanner.hasNextLine()) {
			 String line = scanner.nextLine();
			 Product itemInfo = convertLineIntoInventory(line);
			 
			 if(itemInfo != null) {
				 inventory.put(itemInfo.getSlotId(), itemInfo);
			 }
			 
			 lineNumber++;
		 }
	 }
	 
	 return inventory;
	}
	public Product getProductFromSlot (String slotId) {
		
		return this.inventory.get(slotId.toUpperCase());
		
	//getProduct	
	}

	
	
//inventory	
}
