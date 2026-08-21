package com.javaintro;

public class Task17 {
	
	static String storeName ="KLN Shopping Store"; 
	String customerName;
	String productName;
	double price;
	int quantity;
	double finalAmount;
	
	void addProduct(String pname,double pr, int qty) {
		productName =pname;
		price =pr;
		quantity = qty;
		System.out.println("product added successfully");
	}
	
	void calculateTotal(double discount){
		double totalPrice = price*quantity;
		double discountAmount = totalPrice *discount / 100;
		 finalAmount=totalPrice-discountAmount;
	}
	
	void displayCart() {
        System.out.println("----- Shopping Cart -----");
        System.out.println("Store Name    : " + storeName);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Product Name  : " + productName);
        System.out.println("Price         : " + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Final Amount  : " + finalAmount);
        System.out.println("-------------------------");
    }
	

	public static void main(String args[]) {
		
		Task17 a = new Task17();
		a.customerName="Narasimha";
		a.addProduct("KLShoping", 5000, 1);
		a.calculateTotal(400);
		a.displayCart();
		
		Task17 b = new Task17();
		b.customerName="Simha";
		b.addProduct("KNShoping", 4000, 1);
		b.calculateTotal(400);
		b.displayCart();	
	}

}
