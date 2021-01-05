package com.egen.controller;

import java.util.Scanner;

import com.egen.helper.LocationHelper;
import com.egen.interfce.LocationInterface;
import com.egen.model.LocationModel;

public class LocationController implements LocationInterface {
	Scanner scan;
	LocationModel location;
	LocationHelper store;

	public LocationController() {
		scan = new Scanner(System.in);
		location = new LocationModel();
		store = new LocationHelper();
	}
	public void addLocation() {
		System.out.println("Address of your place: ");
		String address = scan.next();
		System.out.println("city: ");
		String city = scan.next();
		System.out.println("state: ");
		String state = scan.next();
		System.out.println("Contact Number: ");
		String mobile = scan.next();
		System.out.println("zipcode: ");
		int zipcode = scan.nextInt();
		
		location = new LocationModel(address, city, state, zipcode, mobile);
		System.out.println(store.addLocation(location));
	}
	public void deleteLocation() {
		System.out.println("Enter the contact number for deleting the record: ");
		String contact = scan.next();
		
		System.out.println(store.deleteLocation(contact));
	}
	public void updateLocation() {
		System.out.println("Old Contact Number: ");
		String mobile = scan.next();
		
		System.out.println("Address of your place: ");
		String address = scan.next();
		System.out.println("city: ");
		String city = scan.next();
		System.out.println("state: ");
		String state = scan.next();
		System.out.println("zipcode: ");
		int zipcode = scan.nextInt();
		System.out.println("New Contact Number: ");
		String mobile_new = scan.next();
		
		System.out.println(store.updateLocation(address, city, state, zipcode, mobile, mobile_new));
		
	}
	public void fetchLocation() {
		for(LocationModel location : store.fetchLocation()) {
			System.out.println("Address: "+location.getAddress()+" city: "+location.getCity()+" state: "+location.getState()+" zipcode: "+location.getZipcode()+" contact number: "+location.getMobile());
		}
	}
}

