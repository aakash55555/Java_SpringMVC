package com.egen;

import java.util.Scanner;

import com.egen.controller.LocationController;
import com.egen.controller.MenuController;
import com.egen.controller.ReservationController;
import com.egen.interfce.LocationInterface;
import com.egen.interfce.MenuInterface;
import com.egen.interfce.ReservationInterface;

/**
 * Hello world!
 *
 */
public class App 
{
	  public static void main( String[] args )
    {
		  System.out.println( "Welcome to Burger Palace" );
	        
	        Scanner scan = new Scanner(System.in);

	        while(true){
	        	System.out.println("Select your option from 1,2,3");
	        	System.out.print("1. Reservation \n" + "2. Location \n"+"3. Menu \n");
	        	int selected = scan.nextInt();
	        	
	        	switch(selected) {
	        	case 1:
	        		ReservationInterface reservation = new ReservationController();
	        		System.out.println("Create your party reservations");
	        		System.out.print("1. Add Reservation \n" + "2. Get All Reservations \n"+"3. Delete Reservations \n"+ "4. Update Reservations\n");
	        		int option = scan.nextInt();
	        		
	        		switch(option) {
	        		case 1:
	        			reservation.addReservation();
	        			break;
	        		case 2:
	        			reservation.fetchReservation();
	        			break;
	        		case 3:
	        			reservation.deleteReservation();
	        			break;
	        		case 4:
	        			reservation.updateReservation();
	        			break;	
	        		default:
	        			System.out.println("Invalid option selected");
	        		}
	        		
	        		break;
	        		
	        	case 2:
	        		System.out.print("1. Add Location \n" + "2. Get All Location \n"+"3. Delete Location \n"+ "4. Update Location\n");
	        		int choice = scan.nextInt();
	        		
	        		LocationInterface place = new LocationController();
	        		
	        		switch(choice) {
	        		case 1:
	        			place.addLocation();
	        			break;
	        		case 2:
	        			place.fetchLocation();
	        			break;
	        		case 3:
	        			place.deleteLocation();
	        			break;
	        		case 4:
	        			place.updateLocation();
	        			break;	
	        		default:
	        			System.out.println("Invalid option selected");
	        		}
	        		
	        		break;
	        		
	        	case 3:
	        		System.out.print("1. Add Menu Item \n" + "2. Get All Menu Item \n"+"3. Delete Menu Item \n"+ "4. Change Menu Item\n");
	        		int select = scan.nextInt();
	        		
	        		MenuInterface item = new MenuController();
	        		
	        		switch(select) {
	        		case 1:
	        			item.addItem();
	        			break;
	        		case 2:
	        			item.fetchItem();
	        			break;
	        		case 3:
	        			item.deleteItem();
	        			break;
	        		case 4:
	        			item.updateItem();
	        			break;	
	        		default:
	        			System.out.println("Invalid option selected");
	        		}
	        		
	        		break;
	        	
	        	default:
	        		System.out.println("Please select the correct option(1/2/3)");	
	        	}
	        }        
    }
}
