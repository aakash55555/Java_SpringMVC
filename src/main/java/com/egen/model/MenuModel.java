package com.egen.model;

public class MenuModel {
int itemID;
String name;
double price;
public MenuModel(int itemID, String name, double price) {
	super();
	this.itemID = itemID;
	this.name = name;
	this.price = price;
}
public MenuModel() {
}
@Override
public String toString() {
	return "MenuModel [itemID=" + itemID + ", name=" + name + ", price=" + price + "]";
}
public int getItemID() {
	return itemID;
}
public void setItemID(int itemID) {
	this.itemID = itemID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
