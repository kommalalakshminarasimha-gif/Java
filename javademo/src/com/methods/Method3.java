package com.methods;

class Method3 {
	
	//No Arguments & With Return Value
	
	int Method() {
		//The method does not take any input, but returns a value.
		return 100;
	}
    public static void main(String[] args) {
    	
    	Method3 a= new Method3();
    	int Result = a.Method();
    	
    	System.out.println(Result);
            }
}