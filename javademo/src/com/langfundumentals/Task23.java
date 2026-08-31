package com.langfundumentals;

public class Task23 {
	
	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;
	
	Task23(	int accountNumber,	String accountHolderName,double balance,String branch){
		this.accountNumber=accountNumber;
		this.accountHolderName =accountHolderName;
		this.balance=balance;
		this.branch=branch;
	}
	
	Task23(Task23 b,String accountHolderName,String branch){
		this.accountNumber=b.accountNumber;
		this.balance=b.balance;
		this.accountHolderName=accountHolderName;
		this.branch=branch;
	}
	void displayAccountdetails() {
		System.out.println("AccountNumber :" + accountNumber);
		System.out.println("AccountHolderName :" + accountHolderName);
		System.out.println("Balance :" +balance);
		System.out.println("Branch :" + branch);
		System.out.println("-------------------------------------------");
	}

	public static void main(String[] args) {
		Task23 b = new Task23(200,"Narasimha",30000,"Nellore");
		
		Task23 c = new Task23(b,"KL","nlr");
		
//		c.accountHolderName = "KL.Narasimha";
//		c.balance=50000;
		
		System.out.println("Main Result");
		b.displayAccountdetails();
		
		System.out.println("Copied result");
		c.displayAccountdetails();
//		

	}

}
