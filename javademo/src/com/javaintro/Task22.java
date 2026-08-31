package com.javaintro;

public class Task22 {
	
	String EmployeeName;
	double Salary;
	String CompanyName;
	
	  Task22(String EmployeeName,double Salary,String CompanyName) {
		this.EmployeeName=EmployeeName;
		this.Salary=Salary;
		this.CompanyName = CompanyName;
	}
	
	void Object() {
		System.out.println("EmployeeName :" + EmployeeName);
		System.out.println("Salary :" + Salary);
		System.out.println("CompanyName : " + CompanyName);
	}

	public static void main(String[] args) {
		Task22 a = new Task22("Narasimha",50000,"TCS");
		Task22 b = new Task22("KLN",60000,"IBM");
		a.Object();
		System.out.println("**************************************");
		b.Object();
		System.out.println("****************************************");

		
	}

}
