package com.javaintro;

public class LoanManagement {

    String customerName;
    double loanAmount;
    double interestRate;
    int loanTenure;

    // Method to calculate simple interest
    double calculateInterest(double loanAmount, double interestRate) {
        double interest = (loanAmount * interestRate * loanTenure) / 100;
        return interest;
    }

    // Method to calculate total payable amount
    double calculateTotalAmount(double interest) {
        double totalAmount = loanAmount + interest;
        return totalAmount;
    }

    // Method to calculate monthly EMI
    double calculateMonthlyEMI(double totalAmount, int loanTenure) {
        double emi = totalAmount / (loanTenure * 12);
        return emi;
    }

    // Method to display loan summary
    void displayLoanSummary(double interest, double totalAmount, double emi) {

        System.out.println("=================================");
        System.out.println("        LOAN SUMMARY");
        System.out.println("=================================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Loan Amount   : " + loanAmount);
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Loan Tenure   : " + loanTenure + " Years");
        System.out.println("Interest      : " + interest);
        System.out.println("Total Amount  : " + totalAmount);
        System.out.println("Monthly EMI   : " + emi);
        System.out.println("=================================");
    }

    public static void main(String[] args) {

        // First Object
        LoanManagement customer1 = new LoanManagement();

        customer1.customerName = "Ravi";
        customer1.loanAmount = 200000;
        customer1.interestRate = 8;
        customer1.loanTenure = 5;

        double interest1 = customer1.calculateInterest(
                customer1.loanAmount,
                customer1.interestRate);

        double totalAmount1 = customer1.calculateTotalAmount(interest1);

        double emi1 = customer1.calculateMonthlyEMI(
                totalAmount1,
                customer1.loanTenure);

        customer1.displayLoanSummary(
                interest1,
                totalAmount1,
                emi1);


        // Second Object
        LoanManagement customer2 = new LoanManagement();

        customer2.customerName = "Suresh";
        customer2.loanAmount = 500000;
        customer2.interestRate = 10;
        customer2.loanTenure = 10;

        double interest2 = customer2.calculateInterest(
                customer2.loanAmount,
                customer2.interestRate);

        double totalAmount2 = customer2.calculateTotalAmount(interest2);

        double emi2 = customer2.calculateMonthlyEMI(
                totalAmount2,
                customer2.loanTenure);

        customer2.displayLoanSummary(
                interest2,
                totalAmount2,
                emi2);
    }
}