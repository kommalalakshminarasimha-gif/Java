package com.constructors;

class Constructore1 {
	
	String Name;
	int Age;
	
	//No-Argument Constructor
	Constructore1(){
		Name ="Narasimha";
		Age=20;
	}
	
	void Display() {
		System.out.println("Name :" + Name);
		System.out.println("Age : " + Age);
		System.out.println("---------------------");
	}
    public static void main(String[] args) {
    	// Creating object
    	Constructore1 a = new Constructore1();
    	a.Display();

    }
}