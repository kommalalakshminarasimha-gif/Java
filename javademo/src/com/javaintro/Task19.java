package com.javaintro;

public class Task19 {

    // Instance method 1
    int addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);

        return result;
    }

    // Instance method 2
    int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);

        return result;
    }

    // Static method 1
    static int subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);

        return result;
    }

    // Static method 2
    static int division(int a, int b) {
        int result = a / b;
        System.out.println("Division: " + result);

        return result;
    }

    public static void main(String[] args) {

        // Only one object
    	Task19 obj = new Task19();

        // Calling only one method in main
        obj.multiplication(10, 5);
    }
}