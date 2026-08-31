package com.javaintro;

class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }
}

class Car extends Vehicle {
    String brand;
    double price;

    Car(String type, String brand, double price) {
        super(type); 
        this.brand = brand;
        this.price = price;
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String type, String brand, double price, int batteryCapacity) {
        super(type, brand, price);
        this.batteryCapacity = batteryCapacity;
        
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public static void main(String[] args) {

        ElectricCar e = new ElectricCar( "Electric","Tesla",4500000,100);

        e.display();
    }
}