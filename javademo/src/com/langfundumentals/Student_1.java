package com.langfundumentals;

public class Student_1 {
	int student_Id;
	String student_Name;
	
	void studentInfo() {
		System.out.println("Student info method");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		Student_1 a = new Student_1();
		System.out.println(a.student_Id);//0
		System.out.println(a.student_Name);//null
		a.studentInfo();
		System.out.println("Main method ended !!");
		

	}

}
