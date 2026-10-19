package com.arrays;

public class Day1 {

	public static void main(String[] args) {
		// Step1 : Declaration
		
		int[] ages;
		
		//Step2 : Creation
		
		ages = new int[5]; // 0,1,2,3,4,
		
		//Step3 : initialazation
		
		ages[0] =13;
		ages[1]=23;
		ages[2]=33;
		ages[3]=43;
		ages[4]=53;
		
		//Step4 : Representation
		
		for(int i = 0; i <ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		//for-each loop
		
		for(int age : ages) {
			System.out.println(age);
		}

	}

}
