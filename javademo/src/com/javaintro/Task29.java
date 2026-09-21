package com.javaintro;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check age
        if (age < 18) {
            System.out.println("Not Eligible");
        } 
        else {

            // Ask gender only if age is eligible
            System.out.print("Enter your gender (M/F): ");
            char gender = sc.next().charAt(0);

            // Check gender
            if (gender != 'M' && gender != 'F' &&
                gender != 'm' && gender != 'f') {

                System.out.println("Not Eligible");
            } 
            else {

                // Ask voter ID only if gender is valid
                System.out.print("Enter VoterId No: ");
                String voterId = sc.next();

                // Display candidates
                System.out.println("\n----- Candidates -----");
                System.out.println("1. Mark Antony");
                System.out.println("2. John Smith");
                System.out.println("3. David Warner");
                System.out.println("4. Robert Brown");

                System.out.print("\nPress any option to vote: ");
                int option = sc.nextInt();

                // Capture vote
                switch (option) {

                    case 1:
                        System.out.println("Vote is Captured for Mark Antony");
                        break;

                    case 2:
                        System.out.println("Vote is Captured for John Smith");
                        break;

                    case 3:
                        System.out.println("Vote is Captured for David Warner");
                        break;

                    case 4:
                        System.out.println("Vote is Captured for Robert Brown");
                        break;

                    default:
                        System.out.println("Thanks for Voting To NOTA");
                }
            }
        }

        sc.close();
    }
}