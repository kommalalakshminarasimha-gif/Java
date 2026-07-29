package com.javaintro;

public class Task6 {
	    // Static Variable
	    static String collegeName = "KCDC Degree College";

	    // Instance Variables
	    int studentId;
	    String studentName;
	    int englishMarks;
	    int teluguMarks;
	    int hindiMarks;
	    int totalMarks;
	    double percentage;

	    // Method to calculate total marks
	    void calculateTotal() {
	        totalMarks = englishMarks + teluguMarks + hindiMarks;
	    }

	    // Method to calculate percentage
	    void calculatePercentage() {
	        percentage = totalMarks / 3.0;
	    }

	    // Method to display student details
	    void displayTask6() {
	    	System.out.println("---------------------  Student details started  -------------------------");
	        System.out.println("College Name   : " + collegeName);
	        System.out.println("Student ID     : " + studentId);
	        System.out.println("Student Name   : " + studentName);
	        System.out.println("English Marks  : " + englishMarks);
	        System.out.println("Telugu Marks   : " + teluguMarks);
	        System.out.println("Hindi Marks    : " + hindiMarks);
	        System.out.println("Total Marks    : " + totalMarks);
	        System.out.println("Percentage     : " + percentage + "%");
	        System.out.println("---------------------  Student details ended  -------------------------");
	    }

	    public static void main(String[] args) {
	        // Student 1
	    	Task6 s1 = new Task6();
	        s1.studentId = 101;
	        s1.studentName = "Narasimha";
	        s1.englishMarks = 85;
	        s1.teluguMarks = 90;
	        s1.hindiMarks = 80;

	        s1.calculateTotal();
	        s1.calculatePercentage();

	        // Student 2
	        Task6 s2 = new Task6();
	        s2.studentId = 33;
	        s2.studentName = "KL.Narasimha";
	        s2.englishMarks = 75;
	        s2.teluguMarks = 82;
	        s2.hindiMarks = 88;

	        s2.calculateTotal();
	        s2.calculatePercentage();
	        s1.calculateTotal();

	        // Display Details
	        s1.displayTask6();
	        s2.displayTask6();
	        
	    }
	}
	


