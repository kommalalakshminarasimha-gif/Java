package com.javaintro;

public class Task13 {
	
	String passengerName;
	int age;
	String source;
	String destination;
	int numTickets;
	int ticketAmount;
	static int totalticketbought;
	static int totalAmount; 
	static int price = 500;
	
	static {
		
	System.out.println("Welcome to jedal zamana");
	}
	
	void bookTicket() {
		totalticketbought = totalticketbought * price;
		totalticketbought += numTickets;
		totalAmount +=ticketAmount;
		System.out.println("Ticket Booked Succesfully");
		System.out.println("--------------------------");
		displayBookingDetails();
	}
	void displayBookingDetails() {
		System.out.println("PassengerName :" + passengerName);
		System.out.println("Age :" + age);
		System.out.println("Source :" + source);
		System.out.println("Destination :" + destination);
		System.out.println("NumTickets :" + numTickets);
		System.out.println("TotalAmount :" +totalAmount);
		 System.out.println("*****************************************");


	}
	 static void ticketCounter() {
		System.out.println("totalticketbought :" + totalticketbought);
		System.out.println("TotalAmount :" + totalAmount);
	}

	public static void main(String[] args) {
		Task13 a = new Task13();
		
		a.passengerName ="Narasimha";
		a.age = 20;
		a.source = "Hyderabad";
		a.destination="Nellore";
		a.numTickets =5;
		a.totalAmount=300;
		a.bookTicket();
		
		System.out.println("-------------------------");
		
		Task13 b = new Task13();

	b.passengerName ="Lakshmi";
	b.age = 30;
	b.source = "Chennai";
	b.destination="Nellore";
	b.numTickets =10;
	b.ticketAmount=100;
	b.bookTicket();
	b.ticketCounter();
	System.out.println("----------------------------------");
	
	}

}
