package com.egen.model;

public class LocationModel {
String address;
String city;
String state;
int zipcode;
String mobile;
public LocationModel(String address, String city, String state, int zipcode, String mobile) {
	super();
	this.address = address;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	this.mobile = mobile;
}
public LocationModel() {
}
@Override
public String toString() {
	return "LocationModel [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
			+ ", mobile=" + mobile + "]";
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
