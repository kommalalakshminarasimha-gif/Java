package com.batch76;

public class Method {
	
	String Method(int cost) {
		
		if(cost >=50 && 10<=cost)
		     return "pen";
		else
			return "Nothing";
	}
	public static void main(String[] args) {
		
		Method a = new Method();
		String result = a.Method(30);
		System.out.println(result);
		
	}
}
