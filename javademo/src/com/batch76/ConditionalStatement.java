package com.batch76;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int x = 18;
		int y =20;
		int z = 25;
		if(x>y && x>z){
			System.out.println("Hello world :" + x);
		}else if(y>z){
			System.out.println("It me :"  + y);
		}else {
			System.out.println("KLN : " + z);
		}

	}

}
