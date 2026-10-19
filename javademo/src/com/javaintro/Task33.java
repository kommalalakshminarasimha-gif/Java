package com.javaintro;

import java.util.Scanner;

public class Task33 {

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        System.out.println("Prime numbers are:");

        // Length of substring: 1, 2, 3 ... up to number length
        for (int length = 1; length <= num.length(); length++) {

            // Starting position
            for (int i = 0; i <= num.length() - length; i++) {

                String part = num.substring(i, i + length);

                int value = Integer.parseInt(part);

                if (isPrime(value)) {
                    System.out.print(value + " ");
                }
            }
        }

        sc.close();
    }
}