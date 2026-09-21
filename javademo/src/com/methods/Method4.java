package com.methods;

class Method4 {
	
	//Arguments & With Return Value
     //The method takes input and returns a value.
	int add(int a,int b) {
		return a+b;
	}
    public static void main(String[] args) {
    	Method4 a = new Method4();
    	int result = a.add(20, 30);
    	System.out.println("Add : " + result);	
     }
}