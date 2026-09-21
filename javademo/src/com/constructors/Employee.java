package com.constructors;

class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {

    String department;

    Manager(String department) {
        super("KLN", 60000);
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        Manager m = new Manager("IT");

        m.display();
    }
}