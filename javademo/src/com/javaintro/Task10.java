 package com.javaintro;


public class Task10 {
	
	String movie_name;
	int seat_number;
	String booking_status;
	static String theatre_name = "Sai ranga";
	int Ticket_id;
	boolean stores;
	void book_ticket() {
		System.out.println("bookin status : " + booking_status);
	}
	void cancel_ticket() {
		System.out.println("bookin status : " + booking_status);
	}
	void display_ticket_details() {
		System.out.println("Ticket Id is : " + Ticket_id);
		System.out.println("Ticket_stored  : " + stores);
		System.out.println("Movie name is : " + movie_name);
		System.out.println("seat_number is : " + seat_number);
		System.out.println("Theatre_name is : " + theatre_name);
	}
	public static void main(String[]args) {
		Task10 t1 = new Task10();
		t1.movie_name = "Spider_man";
		t1.seat_number = 18;
		t1.booking_status = "Reserved";
		t1.stores = true;
		t1.Ticket_id = 101;
		t1.book_ticket();
		t1.display_ticket_details();
		System.out.println("Your ticket is booked successfully");
		System.out.println("*********************************************");
		
		
		Task10 t2 = new Task10();
		theatre_name = "GPR multiplex";
		t2.movie_name = "Chennai love stroy";
		t2.seat_number = 12;
		t2.booking_status = "Not reserved";
		t2.stores = false;
		t2.Ticket_id = 102;
		t2.book_ticket();
		t2.display_ticket_details();
		System.out.println("Your ticket booking is cancelled");
	}

	
}
