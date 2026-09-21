package com.javaintro;

import java.util.Scanner;

class EvenIndexSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        String str = Integer.toString(n);

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                sum = sum + (str.charAt(i) - '0');
            }
        }

        System.out.println("Sum = " + sum);
    }
}