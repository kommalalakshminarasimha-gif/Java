package com.javaintro;

public class Task1 {
	
	static void kln1() {
		kln2();
		System.out.println("KL.Narasimha1");
	};
        static void kln2() {
        	Task1 a = new Task1();
        	a.kln3();
		System.out.println("KL.Narasimha2");
	}
	 void kln3(){
		 kln4();
		System.out.println("KL.Nrasimha3");
	}
	 
	 void kln4() {
		 kln5();
			System.out.println("KL.Nrasimha4");
		}
	 static void kln5() {
			System.out.println("KL.Nrasimha5");
			Task1 b = new Task1();
			b.kln6();
		}
	 
	 void kln6() {
		 System.out.println("KL.Narasimha6");
	 }
	 
	public static void main(String[] args) {
		System.out.println("This is first program for me");
		kln1();
	}

}
