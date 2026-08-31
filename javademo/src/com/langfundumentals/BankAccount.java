

package com.langfundumentals;

class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;
    String branch;

    BankAccount(int accountNumber, String accountHolderName,
                double balance, String branch) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.branch = branch;
    }

    BankAccount(BankAccount obj) {

        this.accountNumber = obj.accountNumber;
        this.accountHolderName = obj.accountHolderName;
        this.balance = obj.balance;
        this.branch = obj.branch;
    }

    void displayAccountDetails() {

        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance            : " + balance);
        System.out.println("Branch             : " + branch);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        BankAccount account1 =
            new BankAccount(101, "Narasimha", 50000, "Nellore");

        BankAccount account2 = new BankAccount(account1);

        account2.branch = "Hyderabad";
        account2.balance = 75000;

        System.out.println("Original Account:");
        account1.displayAccountDetails();

        System.out.println("Copied Account:");
        account2.displayAccountDetails();
    }
}