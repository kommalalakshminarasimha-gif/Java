package com.javaintro;

public class Task7 {
	
	//Static variables
	
	static  String Library ="KLN";
	static String LibarianName ="Narasimha";

	// Instance varible 
	int bookId;
	String bookTitle;
	String author_Name;
	int avilable_copie;

	//Intsant block
	void Bookdetails() {
		System.out.println("Book Id : " + bookId);
		System.out.println("BookTitle : " + bookTitle);
		System.out.println("AuthorName : " + author_Name);
		System.out.println("Avilable Copies : " + avilable_copie );
	}
	
	//Static block
	
	static void LibraryDetails(){
		System.out.println("Library Name : " + Library);
		System.out.println("LibarianName : " + LibarianName);
		System.out.println("----------------------------------");
		
	}
	public static void main(String[] args) {
		//Object creation 
		Task7 a = new Task7();
		Task7 b = new Task7();
		
		a.bookId =10;
		a.bookTitle ="Men";
		a.author_Name ="KL.Narsimha";
		a.avilable_copie = 24;
		a.Bookdetails();
		a.LibraryDetails();
		
		
		//Displa details
		
		b.bookId =11;
		b.bookTitle ="Women";
		b.author_Name ="Lakshmi";
		b.avilable_copie=16;
		b.Bookdetails();
		b.LibraryDetails();
	
	}
}
