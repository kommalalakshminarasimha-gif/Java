package com.arrays;


public class Task3 {

	public static void main(String[] args) {
		
		int [] arr = {9,5,12,18,22,10,14};
		int second_max = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length; i++) {
			if(arr[i]>max) {
			second_max = max;
			max = arr[i];
		}
		}
		System.out.println("Second max number is :" + second_max );
		
		}

}