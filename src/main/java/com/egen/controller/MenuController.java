package com.egen.controller;

import java.util.Scanner;

import com.egen.helper.LocationHelper;
import com.egen.helper.MenuHelper;
import com.egen.interfce.MenuInterface;
import com.egen.model.LocationModel;
import com.egen.model.MenuModel;

public class MenuController implements MenuInterface{
	Scanner scan;
	MenuModel item;
	MenuHelper store;

	public MenuController() {
		scan = new Scanner(System.in); 
		item = new MenuModel();
		store = new MenuHelper();
	}
	public void addItem() {
		System.out.println("Enter the item id: ");
		int itemID = scan.nextInt();
		System.out.println("Name of the item: ");
		String name = scan.next();
		System.out.println("price of the item: ");
		Double price = scan.nextDouble();
		
		item = new MenuModel(itemID, name, price);
		System.out.println(store.addItem(item));
	}
	public void deleteItem() {
		System.out.println("Enter the item ID to delete: ");
		int itemID = scan.nextInt();
		
		System.out.println(store.deleteItem(itemID));
	}
	public void updateItem() {
		System.out.println("Enter the Item Id number: ");
		int itemID = scan.nextInt();
		
		System.out.println("Enter the new name of the item: ");
		String name = scan.next();
		
		System.out.println("Enter the new price of the item: ");
		Double price = scan.nextDouble();
		
		System.out.println(store.updateItem(itemID, name, price));
		
	}
	public void fetchItem() {
		for(MenuModel item : store.fetchItem()) {
			System.out.println("Item ID: "+item.getItemID()+" Name of the item: "+item.getName()+" Price of the item: "+item.getPrice());
		}
	}
}
