package com.methods;

public class Method2 {
	
	//Arguments & No Return Value
	
	void Method(int a,  String b) {
		String Result = a + b ;
		System.out.println("Result :" + Result);
		
	}
		
		//The method takes input, but does not return a value.
	

	public static void main(String[] args) {
		
		Method2 m = new Method2();
		m.Method(20," " +"Narasimha");

	}

}
