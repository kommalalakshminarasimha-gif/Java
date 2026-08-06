package com.langfundumentals;

//Primitive data Types

public class DataTypesDemo1 {
	
	byte b = 100;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean boo;
	
	public static void main(String[] args) {
		
		DataTypesDemo1 a = new DataTypesDemo1();
		
		System.out.println("byte Value :" +a.b);//0
		System.out.println("Short value :" +a.s);//0
		System.out.println("Int Value :" +a.i);//0
		System.out.println("Long Value :" +a.l);//0
		System.out.println("Float Value :" + a.f);//0.0
		System.out.println("Double Value :" + a.d);//0.0
		System.out.println("Char Value :" + a.c);//
		System.out.println("Boolean Value :" + a.boo);//false
	}

}
