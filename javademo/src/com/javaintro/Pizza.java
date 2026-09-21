package com.javaintro;


import java.util.Scanner;

public class Pizza {

    static class PizzaPrice {

        double getPizzaPrice(char size) {
            if (size == 'S') return 70;
            if (size == 'M') return 100;
            if (size == 'L') return 150;
            return 0;
        }

        double calculatePizzaCost(double price, int qty) {
            return price * qty;
        }

        double calculateDeliveryCharge(double distance) {
            if (distance <= 10) return 70;
            if (distance <= 20) return 100;
            if (distance <= 30) return 150;
            return 0;
        }

        double calculateFinalBill(double pizzaCost, double deliveryCharge) {
            return pizzaCost + deliveryCharge;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PizzaPrice pp = new PizzaPrice();

        System.out.println("Enter size: S/M/L");
        char size = sc.next().toUpperCase().charAt(0);

        System.out.println("Enter quantity:");
        int qty = sc.nextInt();

        System.out.println("Enter distance:");
        double distance = sc.nextDouble();

        double price = pp.getPizzaPrice(size);

        if (price <= 0) {
            System.out.println("Invalid size");
            return;
        }

        if (qty <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        if (distance <= 0) {
            System.out.println("Invalid distance");
            return;
        }

        double pizzaCost = pp.calculatePizzaCost(price, qty);
        double deliveryCharge = pp.calculateDeliveryCharge(distance);
        double finalBill = pp.calculateFinalBill(pizzaCost, deliveryCharge);

        System.out.println("\n..... BILL .....");
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Pizza Cost: " + pizzaCost);
        System.out.println("Quantity: " + qty);
        System.out.println("Distance: " + distance);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Bill: " + finalBill);

        sc.close();
    }
}
