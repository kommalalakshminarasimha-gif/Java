package com.constructors;

public class Constructore3 {
	
	String Name;
	int Age;
	
	//Parameterized Constructor
	//instance variable constructor parameter
	Constructore3(String Name,int Age){
		this.Name=Name;  
		this.Age=Age;
	}
	
	void Display() {
		
		System.out.println("Name :" + Name);
		System.out.println("Age :" + Age);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		Constructore3 a = new Constructore3("KL.Narasimha",20);
		a.Display();

	}

}
