package com.javaintro;

public class Task3 {

       public static void main(String[] args) {

        // Creating an object
    	Task3 obj = new Task3();

        // 1. Nullifying the object
        obj = null;

        // Calling Garbage Collector
        System.gc();

        // Another way to call Garbage Collector
        Runtime.getRuntime().gc();

        System.out.println("Garbage Collector Requested");
    }
    protected void finalize() throws Throwable {
        System.out.println("Object is Garbage Collected");
    	   
    }
}