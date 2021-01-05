package com.egen.helper;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.egen.model.LocationModel;
import com.egen.model.MenuModel;
import com.egen.model.ReservationModel;

public class MenuHelper {
	List<MenuModel> list;

	private final String ITEM_CHANGED = "Item changed";
	private final String ITEM_NOTCHANGED = "Unable to change item";
	private final String ITEM_ADDED = "Item added";
	private final String ITEM_DELETED= "Item deleted";
	private final String ITEM_NOTDELETED = "Unable to delete the item";

	public MenuHelper() {
			list = new ArrayList();
			list.add(new MenuModel(1, "Vegetable Burger", 9.6));
			list.add(new MenuModel(2, "Beef Burger", 10.5));
			list.add(new MenuModel(3, "Cheese Burger", 5.6));
			list.add(new MenuModel(4, "Chicken Burger", 6.0));
			list.add(new MenuModel(5, "Chicken Cheese Burger", 8.0));
	}
	public String addItem(MenuModel model) {
		list.add(model);
		return ITEM_ADDED;
	}
	public String deleteItem(int itemID) {
		boolean status = false;
		for(MenuModel item : list) {
			if(item.getItemID() == itemID) {
				list.remove(item);
				status = true;
			}
		}
		return status == false? ITEM_NOTDELETED : ITEM_DELETED;
	}

	public String updateItem(int ItemID, String name, double price) {
		boolean status = false;
		for(MenuModel item : list) {
			if(item.getItemID() == ItemID) {
				item.setName(name);
				item.setPrice(price);
				status = true;
			}
		}
		return status == false? ITEM_NOTCHANGED : ITEM_CHANGED;
	}

	public List<MenuModel> fetchItem() {
		return list;
	}

}
