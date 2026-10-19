package com.methods;



public class MethodOverLoading {

    // Method 1: Two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Two double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();

        System.out.println(obj.add(10, 20));

        System.out.println(obj.add(10, 20, 30));

        System.out.println(obj.add(10.5, 20.5));
    }
}
