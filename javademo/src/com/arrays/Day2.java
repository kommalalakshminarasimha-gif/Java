package com.arrays;

public class Day2 {

	public static void main(String[] args) {
		System.out.println("Main method 1");
				
		int[] n = new int[0];//Rex : java.lang.NegativeArraySizeException
		
		int[] number = new int[100];
		
		System.out.println(number);

		
		number[0] = 1001;
		number[1] = 1002;
		number[2] = 1003;
		number[3] = 1004;
		number[4] = 1005;
	
//		System.out.println(number);//Address of the [I@1dbd16a6
//		for(int i = 0; i<number.length; i ++) {
//			if(number[i] % 2 == 0 && number[i] !=0 )
//			System.out.println(number[i]);
//		}
		
//		
//		for(int n:number) {
//		if(n% 2 == 0) {
//			System.out.println(n);
//			
//		}
//		}
		
		System.out.println("Main menthod ended");


	}

}
