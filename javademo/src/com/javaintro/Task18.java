package com.javaintro;

public class Task18 {
	
	static String shopName="KLN Mall";
	String customerName;
	String mobileName;
	double price;
	int quantity;
	double finalAmount;
	
	void addMobile(String mname, double pr, int qty) {
		 customerName  = mname;
		 price = pr;
		 quantity=qty;
		System.out.println("Mobile added successfully");
	}
	 void calculateTotal(double discount) {
		 double totaleprice = price*quantity;
		 double totaldiscount = totaleprice*discount/100;
		 finalAmount = totaleprice-totaldiscount;
	 }
	 void displayBill() {
		 System.out.println("CustomerName :" +customerName);
		 System.out.println("MobileName :" + mobileName);
		 System.out.println("Price :" + price);
		 System.out.println("Qantity :"+quantity);
		 System.out.println("FinalAmount :" + finalAmount);
		 System.out.println("-----------------------------");
		 System.out.println("++++++++++++++++++++++++++++++");
	 }
	

	 public static void main(String[] args) {
		 Task18 a = new Task18();
		 a.customerName="Narasimha";
		 a.addMobile("KLNShop",5000,5);
		 a.calculateTotal(50);
		 a.displayBill();
		 
		 Task18 b = new Task18();
		 a.customerName="KL.Narasimha";
		 b.addMobile("Shop",6000,2);
		 b.calculateTotal(80);
		 b.displayBill();
		 
		 
		 
	}

}
