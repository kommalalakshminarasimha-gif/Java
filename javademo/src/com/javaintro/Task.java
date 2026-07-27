package com.javaintro;

public class Task {
	 int myId;
	 String myName;
	 
		static int gameId;
		static String gameName;
		
		static void kln() {
			System.out.println("Narasimha kl");
		}
	
	public static void main(String[] args) {
		System.out.println("KLN");
		
		gameId =3;
		gameName = "KL.Narasimha";
		
		Task b = new Task();
		System.out.println("MyId: " + gameId);
		System.out.println("MyName: " + gameName);
		
		
		b.myId =33;
		b.myName = "Narasimha";
		System.out.println("MyName: " + b.myId);
		System.out.println("MyName : " + b.myName);
		
		Task c = new Task();
		
		c.myId =333;
		c.myName ="KLakshmi Narasimha";
		
		System.out.println("MyId: "+ c.myId);
		System.out.println("MyName: " + c.myName);
		kln();
		
		Task d = new Task();
		d.myId =3333;
		d.myName = "Simha";
		
		Task e = new Task();
		e.myId =30;
		e.myName ="LAKSHMINARASIMHA";
		
		System.out.println("MyId:" + e.myId);
		System.out.println("MyName : " + e.myName);
	}

}
