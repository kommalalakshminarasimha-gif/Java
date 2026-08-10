package com.langfundumentals;

//Primitive data Types

public class DataTypesDemo1 {


	//note : By default RHS values are int type
 
		// the byte min-max range is -128 to 127
		byte b = 127;
		
		//CE : type mismatch convert from int to byte
		byte b1 = (byte) 128;
		
		//-128, -127, -126, -125 ...... 0 1 2 3 4.... 126 127 
		short s  = b1; //converting byte to short 
		
		//short means 2 bytes = 2^15
		//range : -32768 to 32767  
		short s1 = -32767;
		
		
		//int means means 4 bytes = 32bits = 2^31 =  -2147483648 to 2147483647 to
		
		int i = 2147483647;
		
		//the literal 2147483647 of type int is out of range
		int i1  = (int) 2147483648L;
		
		//long means 8 bytes = 64bits = 2^63 = 
		long l = 2147483647;
		long l1 = -9223372036854775808L;
		long l2 = 9223372036854775807L;
		
		//float means 4 bytes
		//double means 8 bytes
		//by default values
		float f = 5.9f;
		double d = 6.5d;
		
		
		//char means 2 bytes = 16bits = 32768 + 32767 = 65535
		//the range of char is 0 to 65535
		char c = 'A';
		char c1 = 'M';
		
		char c2 = 65; // ASCII codes ----> 65 to 90 = A to Z 
	    char c3 = 97;//  ASCII codes ----> 97 to 122 = a to z
	    char c4 = '\u0040' ; //unicodes
	    int i5 = 'C';
		boolean bool = true;
		
		short s2 = (short)32768;
		 public  static void main(String[] args) {
			 DataTypesDemo1 t = new DataTypesDemo1 ();
			 System.out.println(t.s);
			 System.out.println(t.s1);
			 System.out.println(t.s2);
			 System.out.println(t.i);
			 System.out.println(t.i1);
			 System.out.println(t.f);
			 System.out.println(t.d);
			 System.out.println(t.c);
			 System.out.println(t.c1);
			 System.out.println(t.c2);
			 System.out.println(t.c3);
			 System.out.println(t.c4);
			 System.out.println(t.i5);
			 System.out.println(t.bool);
		 }
	}

