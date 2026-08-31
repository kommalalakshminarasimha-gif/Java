package com.langfundumentals;

class Parent {
	String name;

	Parent() {
		System.out.println("Parent");
	}
//
	Parent(String name) {
		this.name = name;
	}
}

public class Demo extends Parent {
	Demo() {
		super("jhhh");
		System.out.println("Demo");
	}

//	int id;
//	String name;
//	double salary;
//    Demo(){
//    	this(1,"xyz");
//    }
//	Demo(int id,String name){
//		this(id,name,6000);
//	}
//	
//	public Demo(int id, String name, double salary) {
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.display();
//	}
//	void display() {
//		System.out.println("Id: " + id);
//		System.out.println("Name : " + name);
//		System.out.println("Salary : " + salary);
//	}
	public static void main(String[] args) {
		Demo m = new Demo();
		m.d();
	}

	void d() {
		System.out.println("Name : " + name);
	}
}
