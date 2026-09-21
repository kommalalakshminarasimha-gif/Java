package com.constructors;

class Constructore5 {
	String Name;
	int Age;
	
	Constructore5(){
		this("KL.Narasimha", 24);
	}
	Constructore5(	String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}
	
	void Display() {
		System.out.println("Name :" + Name);
		System.out.println("Age :" + Age);
		System.out.println("----------------------");
	}
	
    public static void main(String[] args) {
    	Constructore5 a = new Constructore5();
    	a.Display();
    	
    }
}