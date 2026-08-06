package com.javaintro;

public class Task11 {
		int items;
		double totalAmount;
		String orderPlace;
		String website = "Pizzahut";
		int changedAmount;
		
		void addItem(){
			items += 1;
			totalAmount = totalAmount + changedAmount;
			System.out.println("Total Amount :" + totalAmount);	
	    }
		void placeOder() {
			System.out.println("Placed Order :" + orderPlace);
		}
		void changedWebsite() {
			website = "Zomato";
			System.out.println("New Wibsite :" + website);
		}
		
		void displayWebsite() {
			System.out.println("Display Website :" + website );
		}
		void displayCart() {
			System.out.println("Items : " + items);
			System.out.println("Total Amount : " +totalAmount);
			System.out.println("Oreder Stutas :" + orderPlace);
			System.out.println("Website Name :" +website);
			System.out.println("update Amoount :" + changedAmount);
			
		}

	public static void main(String[] args) {
		Task11 a = new Task11();
		a.items = 4;
		a.totalAmount = 1000;
		a.orderPlace ="Nellore";
		a.website = "Pizzahut";
		a.changedAmount = 2000;
		a.displayCart();
		a.addItem();
		System.out.println("-------------------------");
		
		Task11 b = new Task11();
		
		b.items = 5;
		b.totalAmount = 4000;
		b.orderPlace ="Goa";
		b.website = "Pizzahut";
		b.changedAmount = 5000;
		b.changedWebsite();
		b.displayCart();
		b.addItem();
		System.out.println("----------------");
		
	}

}
