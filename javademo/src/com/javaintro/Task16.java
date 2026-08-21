package com.javaintro;

public class Task16 {
	int addition(int a,int b) {
		return a+b;
	}
	int substraction(int a, int b) {
		return a-b;
	}
	int multiplication(int a, int b) {
		return a*b;
	}
	
	int division(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Task16 a = new Task16();
		
		int result =a.addition(3,5);
		System.out.println("Addition :"+result);
		
		int result2 =a.substraction(result,5);
		System.out.println("Substraction :"+result2 );
		
		int result3 =a.multiplication(result,6);
		System.out.println("Multiplication :"+result3);
		
		int result4 = a.division(result,8);
		System.out.println("Division :" +result4);
		
	}
}
