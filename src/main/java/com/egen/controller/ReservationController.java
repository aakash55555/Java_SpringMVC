package com.egen.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.egen.helper.ReservationHelper;
import com.egen.interfce.ReservationInterface;
import com.egen.model.ReservationModel;

public class ReservationController implements ReservationInterface{
	Scanner scan;
	ReservationModel reservation;
	ReservationHelper reserve;

	public ReservationController() {
		scan = new Scanner(System.in);
		reservation = new ReservationModel();
		reserve = new ReservationHelper();
	}
	public void addReservation() {
		System.out.println("Enter a unique reservation id: ");
		int id = scan.nextInt();
		boolean checkId = reserve.checkId(id);
		if(checkId == false) {
			System.out.println("This unique id has already been taken");
			return;
		}
		System.out.println("Enter a name for reservation: ");
		String name = scan.next();
		System.out.println("Enter a year(YYYY) for reservation ");
		int year  = scan.nextInt();
		boolean checkYear = reserve.checkYear(year);
		System.out.println("Enter a month(MM) for reservation ");
		int month  = scan.nextInt();
		boolean checkMonth = reserve.checkMonth(month);
		System.out.println("Enter a date(DD) for reservation ");
		int date  = scan.nextInt();
		boolean checkDate = reserve.checkDate(date);
		System.out.println("get hours(HH) when you want event to happen: ");
		int hours = scan.nextInt();
		boolean checkHours = reserve.checkMinutes(hours);
		System.out.println("get Minutes(MM) when you want event to happen: ");
		int minutes = scan.nextInt();
		boolean checkMinutes = reserve.checkMinutes(minutes);
		LocalDate localDate = null;
		LocalTime  time = null;
		try {
			localDate = LocalDate.of(year, month, date);
			time= LocalTime.of(hours, minutes);
		}
		catch(Exception e) {
			System.out.println("Please enter proper date");
			
		}
		reservation = new ReservationModel(id, name, localDate, time);
		System.out.println(reserve.addReservation(reservation));
	}
	public void deleteReservation() {
		System.out.println("Enter the reservation id");
		int reservationId = scan.nextInt();
		
		System.out.println("Enter the reservation name");
		String name = scan.next();	
		
		System.out.println(reserve.deleteReservation(reservationId, name));
	}
	public void updateReservation() {
		System.out.println("Get reservation id: ");
		int id = scan.nextInt();
		boolean checkReservationId = reserve.checkId(id);
		if(checkReservationId == false) {
			System.out.println("No such id exists");
		}
		boolean checkId = reserve.checkId(id);
		if(checkId == false) {
			System.out.println("This unique id has already been taken");
		}
		System.out.println("Enter a name for reservation: ");
		String name = scan.next();
		System.out.println("Enter a year(YYYY) for reservation ");
		int year  = scan.nextInt();
		boolean checkYear = reserve.checkYear(year);
		System.out.println("Enter a month(MM) for reservation ");
		int month  = scan.nextInt();
		boolean checkMonth = reserve.checkMonth(month);
		System.out.println("Enter a date(DD) for reservation ");
		int date  = scan.nextInt();
		boolean checkDate = reserve.checkDate(date);
		System.out.println("get hours(HH) when you want event to happen: ");
		int hours = scan.nextInt();
		boolean checkHours = reserve.checkMinutes(hours);
		System.out.println("get Minutes(MM) when you want event to happen: ");
		int minutes = scan.nextInt();
		boolean checkMinutes = reserve.checkMinutes(minutes);
		LocalDate localDate = null;
		LocalTime  time = null;
		try {
			localDate = LocalDate.of(year, month, date);
			time= LocalTime.of(hours, minutes);
		}
		catch(Exception e) {
			System.out.println("Please enter proper date");
			
		}
		reservation = new ReservationModel(id, name, localDate, time);
		System.out.println(reserve.addReservation(reservation));
		
	}
	
	public void fetchReservation() {
		for(ReservationModel reservation : reserve.fetchReservation()) {
			System.out.println("Reservation id: "+reservation.getReservationID()+ "Reservation Name: "+reservation.getName()+" date of reservation: "+reservation.getReservationDate()+" time of reservation: "+reservation.getReservationTime());
		}
	}
}
