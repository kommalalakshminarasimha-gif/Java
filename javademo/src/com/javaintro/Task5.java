package com.javaintro;

public class Task5 {


	    public static void main(String[] args) {

	        // Creating objects
	    	Task5 obj1 = new Task5();
	    	Task5 obj2 = new Task5();
	    	Task5 obj3 = new Task5();

	        // Ways to nullify objects

	        // 1. Assign null
	        obj1 = null;

	        // 2. Reassign reference
	        obj2 = new Task5();

	        // 3. Anonymous object
	        new Task5();

	        // Calling Garbage Collector

	        // Way 1
	        System.gc();

	        // Way 2
	        Runtime.getRuntime().gc();

	        System.out.println("Garbage Collector Requested.");
	    }
	}


