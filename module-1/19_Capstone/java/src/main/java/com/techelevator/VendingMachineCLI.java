package com.techelevator;

import java.math.BigDecimal;
import com.techelevator.Inventory;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };
	
	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION };

	private Menu menu;

	private Scanner userInputScanner = new Scanner(System.in);
	private Purchase purchase = new Purchase();
	private Inventory inventory = new Inventory();
	private Object option = new Object();
	
	
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
	
	
	public void runPurchaseMenu() {
		
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
			
			if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
				System.out.println("Feed Money"); // TODO prompt for an amount
				String moneyString = userInputScanner.nextLine(); //use if statement for valid amount
				BigDecimal deposit = new BigDecimal(moneyString); //be sure that BigDecimal.equals(BigDecimal.valueOf(1));
				purchase.feedMoney(deposit);
			} else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
				System.out.println("Select Product"); //getProductFromSlot and purchase
				
				Object[] selection = {};
				
				option.getChoiceFromUserInput(selection);
			} else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
				System.out.println("Finish Transaction"); // Purchase
				return;
			}
		}
	}
	
	public void run() {
		this.inventory.loadInventory();
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				System.out.println("Select an Item: ");// display vending machine items
				inventory.displayVendingItems();
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				runPurchaseMenu();// do purchase
			}
		}
	}

}
