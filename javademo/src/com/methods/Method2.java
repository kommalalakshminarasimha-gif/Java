package com.methods;

public class Method2 {
	
	//Arguments & No Return Value
	void Method(int a, String b ) {
		
		//The method takes input, but does not return a value.
		String result =a + b;
		System.out.println("Sum :" + result);
	}

	public static void main(String[] args) {
		Method2 a = new Method2();
		a.Method(20," Narsimha");

	}

}
