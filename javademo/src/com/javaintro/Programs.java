package com.javaintro;

public class Programs {
	static int a = 20;
	static {
		System.out.println("This is static block");
	}
	
	int Age;
	String Name;
	
	static int Id;
	static String Persone;

	public static void main(String[] args) {
          System.out.println("Wellcome to java world");
          Id = 13;
          Persone = "Narasimha";
          System.out.println("Age is: " + Id);
          System.out.println("Cand is: " + Persone);
		
	}

}


// This is static block

//static {
//	System.out.println("This is static block");
//}
