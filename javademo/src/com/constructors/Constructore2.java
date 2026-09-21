package com.constructors;

public class Constructore2 {
	String Name;
	int Age;
	
	//1. Default Constructor

    //A default constructor is automatically provided by the 
    //Java compiler only when you don't create any constructor yourself.
	
	void Display() {
		System.out.println("Name :" + Name);
	System.out.println("Age :" + Age);
	}
	
	public static void main(String[] args) {
		//Create An Object
		
		Constructore2 a = new Constructore2();
		a.Display();
		
//		System.out.println(a.Name);
//		System.out.println(a.Age);
		
		
	}

}
