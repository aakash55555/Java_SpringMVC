package com.egen.helper;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.egen.model.ReservationModel;

public class ReservationHelper {
	List<ReservationModel> list;

	private final String RESERVATION_CHANGED = "Location changed";
	private final String RESERVATION_NOTCHANGED = "Unable to change reservation";
	private final String RESERVATION_ADDED = "Reservation added";
	private final String RESERVATION_DELETED= "Reservation deleted";
	private final String RESERVATION_NOTDELETED = "Unable to delete reservation";

	public ReservationHelper() {
			list = new ArrayList();
			LocalDate date1 = LocalDate.of(2021, 10, 12);
			LocalTime time1 = LocalTime.of(12, 54);
			list.add(new ReservationModel(1, "Rohan's Birthday party", date1, time1));
			LocalDate date2 = LocalDate.of(2021, 10, 20);
			LocalTime time2 = LocalTime.of(5, 54);
			list.add(new ReservationModel(456, "Abhilash's Wedding Annivesary", date2, time2));
			LocalDate date3 = LocalDate.of(2021, 10, 30);
			LocalTime time3 = LocalTime.of(3, 54);
			list.add(new ReservationModel(56, "Rohit's Marriage", date3, time3));
			LocalDate date4 = LocalDate.of(2021, 9, 12);
			LocalTime time4 = LocalTime.of(9, 54);
			list.add(new ReservationModel(97, "Birthday Bash", date4, time4));
			LocalDate date5 = LocalDate.of(2021, 8, 12);
			LocalTime time5 = LocalTime.of(3, 54);
			list.add(new ReservationModel(100, "Job Joining Party", date5, time5));
	}
	
	public boolean checkMinutes(int minutes) {
		boolean status = false;
		if(minutes >= 0 && minutes <= 60) {
			status = true;
		}
		return status;
	}
	public boolean checkHours(int hours) {
		boolean status = false;
		if(hours >= 0 && hours <= 60) {
			status = true;
		}
		return status;
	}
	public boolean checkYear(int year) {
		boolean status = false;
		if(year >= 2021 && year <= 2022) {
			status = true;
		}
		return status;
	}
	public boolean checkMonth(int month) {
		boolean status = false;
		if(month >= 1 && month <= 12) {
			status = true;
		}
		return status;
	}
	public boolean checkDate(int date) {
		boolean status = false;
		if(date >= 1 && date <= 31) {
			status = true;
		}
		return status;
	}
	public boolean checkId(int id) {
		boolean status = true;
		for(ReservationModel model: list) {
			if(model.getReservationID() == id) {
				status = false;
				return status;
			}
		}
		return status;
	}
	public boolean checkReservationId(int id) {
		boolean status = false;
		for(ReservationModel model: list) {
			if(model.getReservationID() == id) {
				status = true;
				return status;
			}
		}
		return status;
	}
	
	public boolean checkReservationDateTime(LocalDate date, LocalTime time) {
		boolean status = false;
		for(ReservationModel model: list) {
			if(model.getReservationDate().equals(date) && model.getReservationTime().equals(time)) {
				status = true;
				return status;
			}
		}
		return status;
	}
	
	public String addReservation(ReservationModel reservation) {
		list.add(reservation);
		return RESERVATION_ADDED;
	}
	public String deleteReservation(int reservationID, String name) {
		boolean status = false;
		for(ReservationModel reservation : list) {
			if(reservation.getReservationID() == reservationID && reservation.getName().equalsIgnoreCase(name)) {
				list.remove(reservation);
				status = true;
			}
		}
		return status == false? RESERVATION_NOTDELETED : RESERVATION_DELETED;
	}

	public String updateLocation(int id, String name, LocalDate date, LocalTime time) {
		boolean status = false;
		for(ReservationModel reservation : list) {
			if(reservation.getReservationID() == id) {
				reservation.setName(name);
				if(!checkReservationDateTime(date, time)) {
				reservation.setReservationDate(date);
				reservation.setReservationTime(time);
				status = true;
				}
			}
		}
		return status == false? RESERVATION_NOTCHANGED : RESERVATION_CHANGED;
	}

	public List<ReservationModel> fetchReservation() {
		return list;
	}

}
