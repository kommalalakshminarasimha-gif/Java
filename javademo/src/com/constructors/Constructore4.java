package com.constructors;

public class Constructore4 {
	String Name;
	int Age;
	
	Constructore4(String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}
	
	Constructore4(Constructore4 e){
		this.Name=e.Name;
		this.Age=e.Age;
	}
	
	void Display() {
		System.out.println("Name :" + Name);
		System.out.println("Age :" + Age);
		System.out.println("--------------------");
	}
	public static void main(String[] args) {
		Constructore4 a = new Constructore4("Narasimha",21);
		a.Display();

	}

}
