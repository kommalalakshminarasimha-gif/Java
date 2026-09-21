package com.javaintro;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        if (n == 1) {
            System.out.println(0);
        } 
        else if (n == 2) {
            System.out.println(1);
        } 
        else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci Number: " + b);
        }
    }
}