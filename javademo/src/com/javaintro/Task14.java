package com.javaintro;

public class Task14 {
	String cusName;
	int courierId;
	String source;
	String destination;
	int weight;
	int deliveryAmount;
	static int totalcouriers;
	static int totalweight;
	static int totalAmountCollected;
	static int  priceperkg = 100;
	
	static {
		System.out.println("Welcome to jadal zamana");
	}
	
	void bookcourier() {
		deliveryAmount =weight * priceperkg;
		totalcouriers++;
		totalweight += weight;
		totalAmountCollected += deliveryAmount;
		System.out.println("Courier booked successfully");
	}
	
	void displayCourierDetails() {
		System.out.println("CusName :"+ cusName);
		System.out.println("CourierId :"+ courierId);
		System.out.println("Source :"+ source);
		System.out.println("Destination :" + destination);
		System.out.println("Weight :" + weight);
		System.out.println("DeliveryAmount :"+ deliveryAmount);
	}
	void displayTodayscollection() {
		System.out.println("TotalCouriers :"+totalcouriers);
		System.out.println("TotalWeight :" +totalweight);
		System.out.println("TotalAmountCollected :" + totalAmountCollected);
		System.out.println("Priceperkg :" + priceperkg);
	}

	public static void main(String[] args) {
		Task14 a = new Task14();
		
		a.cusName="Narasimha";
		a.courierId = 30;
		a.source = "Nellore";
		a.destination = "Tirupati";
		a.weight = 3;
		System.out.println("-------------------------------");
		a.bookcourier();
		a.displayCourierDetails();
		
		Task14 b = new Task14();
		b.cusName="Lakshmi";
		b.courierId = 40;
		b.source = "Hyd";
		b.destination = "Goa";
		b.weight = 5;
		System.out.println("-------------------------------");
		b.bookcourier();
		b.displayCourierDetails();
		b.displayTodayscollection();
	}

}
