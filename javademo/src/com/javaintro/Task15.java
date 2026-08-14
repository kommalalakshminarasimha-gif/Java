package com.javaintro;

public class Task15 {
	String employeeName;
	int employeeId;
	String designation;
	String department;
	double salary;
	String remoteLocation;
	String companyName ="HCL";
	String companyLocation="Nellore";
	
	static {
		System.out.println("Welcome to jadal zamana");
	}
	
	void displayEmployeeDetails() {
		System.out.println("EmployeeName :" + employeeName);
		System.out.println("EmployeeId :" +employeeId);
		System.out.println("designation :" + designation);
		System.out.println("Department :" + department);
		System.out.println("Salary :" + salary);
		System.out.println("RemoteLocatin :" + remoteLocation);
		System.out.println("CompanyName :" + companyName);
		System.out.println("CompanyLocation :" + companyLocation);
		System.out.println("---------------------------------------");
	}
	void promoteEmployee() {
		 String employeeName ="KL.Narasimha";
		 System.out.println("Changed Name:"+employeeName);
		
	}
	void updateSalery() {
		 salary += 5000;
		System.out.println("Update Name :"+salary);
	}
	void updateEmpLoyeeLocation(){
		String loc = "Hyd";
		System.out.println("Chenged Loc :"+loc);
	}
	
	public static void main(String[] args) {
		Task15 a = new Task15();
		a.employeeName = "Narasimha";
		a.employeeId = 20;
		a.designation = "Manager";
		a.department = "JFS";
		a.salary = 300;
		a.remoteLocation ="Goa";
		System.out.println("--------------------");
		a.displayEmployeeDetails();
		a.promoteEmployee();
		a.updateSalery();
		a.updateEmpLoyeeLocation();
		System.out.println("-------------------------------------");
	}

}
