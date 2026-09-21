package com.constructors;

class Parent {
	int age;

//	Parent() {
//		System.out.println("Parent");
//	}
	Parent(int age) {
		this.age = age;
	}
}

public class Child extends Parent {

//	Child() {
//		System.out.println("Child");
//	}
	Child(){
		super(10);
		System.out.println("Child");
	}
	void dis() {
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.dis();
	}

}
