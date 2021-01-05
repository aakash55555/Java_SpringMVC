package com.egen.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationModel {
public ReservationModel() {
		super();
	}
String name;
int ReservationID;
LocalDate ReservationDate;
LocalTime ReservationTime;
public String getName() {
	return name;
}
public ReservationModel(int reservationID, String name, LocalDate reservationDate, LocalTime reservationTime) {
	super();
	this.name = name;
	this.ReservationID = reservationID;
	ReservationDate = reservationDate;
	ReservationTime = reservationTime;
}
public int getReservationID() {
	return ReservationID;
}
public void setReservationID(int reservation_id) {
	this.ReservationID = reservation_id;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getReservationDate() {
	return ReservationDate;
}
public void setReservationDate(LocalDate reservationDate) {
	ReservationDate = reservationDate;
}
public LocalTime getReservationTime() {
	return ReservationTime;
}
public void setReservationTime(LocalTime reservationTime) {
	ReservationTime = reservationTime;
}
@Override
public String toString() {
	return "ReservationModel [name=" + name + ", reservation id=" + ReservationID + ", ReservationDate="
			+ ReservationDate + ", ReservationTime=" + ReservationTime + "]";
}

}
