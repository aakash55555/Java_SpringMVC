package com.egen.helper;

import java.util.ArrayList;
import java.util.List;

import com.egen.model.LocationModel;;

public class LocationHelper {
List<LocationModel> list;

private final String LOCATION_CHANGED = "Location changed";
private final String LOCATION_NOTCHANGED = "Unable to change location";
private final String LOCATION_ADDED = "Location added";
private final String LOCATION_DELETED= "Location deleted";
private final String LOCATION_NOTDELETED = "Unable to delete location";

public LocationHelper() {
		list = new ArrayList();
		list.add(new LocationModel("East lemon Street","Tempe","Arizona",85851,"9584562485"));
		list.add(new LocationModel("Apache Bouleyard","Phoenix","Arizona",85700,"9584559865"));
		list.add(new LocationModel("East University Drive","Chandler","Arizona",85651,"9584548658"));
		list.add(new LocationModel("Mill Avenue","Scottsdale","Arizona",85900,"9584532658"));
		list.add(new LocationModel("Orange Stree","Mesa","Arizona",85956,"9584578459"));
}
public String addLocation(LocationModel model) {
	list.add(model);
	return LOCATION_ADDED;
}
public String deleteLocation(String model) {
	boolean status = false;
	for(LocationModel location : list) {
		if(location.getMobile().equals(model)) {
			list.remove(location);
			status = true;
		}
	}
	return status == false? LOCATION_NOTDELETED : LOCATION_DELETED;
}

public String updateLocation(String address, String city, String state, int zipcode, String mobile, String new_number) {
	boolean status = false;
	for(LocationModel location : list) {
		if(location.getMobile().equals(mobile)) {
			location.setAddress(address);
			location.setCity(city);
			location.setMobile(new_number);
			location.setState(state);
			location.setZipcode(zipcode);
			status = true;
		}
	}
	return status == false? LOCATION_NOTCHANGED : LOCATION_CHANGED;
}

public List<LocationModel> fetchLocation() {
	return list;
}

}
