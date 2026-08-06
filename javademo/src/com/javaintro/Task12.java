package com.javaintro;

public class Task12 {
	
	String EmployeeName;
	int MonthlySalary;
	int MonthlyGST;
	int MonthlyPF;
	int NetMonthlySalary;
	double AnnualGST;
	int AnnualPF;
	int AnnualNetSalary;
	
	void calculateMonthlyPF() {
		MonthlyPF =  MonthlySalary * 2/100;
		System.out.println("Calculate Mothly PF : " + MonthlyPF);
	}
	void calculateMonthlyGST() {
		MonthlyGST = MonthlySalary * 3/100;
		System.out.println("MonthlyGST :" +MonthlyGST);
	}
	void calculateNetMonthlysalary() {
		
		NetMonthlySalary =  (MonthlySalary-MonthlyGST-MonthlyPF);
		System.out.println("CalculateNetMonthlySalary : " + NetMonthlySalary );
	}
	 void calculateAnnualGST() {
		 AnnualGST = MonthlyGST *12;
		 System.out.println("CalculateAnnualGST : " + AnnualGST);
		 
	 }
	void calculateAnnualPF() {
		AnnualPF = 100*12;
		 System.out.println("CalculateAnnualPF : " + AnnualPF);
	 }
	void calculateAnnualnetsalary() {
		AnnualNetSalary = NetMonthlySalary *12;
		 System.out.println("CalculateAnnualNetSalary :" + AnnualNetSalary);
	 }
	 void displayEmployeeDetails() {
		 System.out.println("Employee Name : " + EmployeeName);
		 System.out.println("MonthlySalary : " + MonthlySalary);
	 }
	public static void main(String[] args) {
		Task12 a = new Task12();
		a.EmployeeName="Narasimha";
		a.MonthlySalary = 9000;
		a.displayEmployeeDetails();
		a.calculateMonthlyPF();
		a.calculateMonthlyGST();
		a.calculateNetMonthlysalary();
		a.calculateAnnualGST();
		a.calculateAnnualPF();
		a.calculateAnnualnetsalary();
		System.out.println("-------------------------");
	}

}
