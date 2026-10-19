package com.arrays;

public class Day5 {

	public static void main(String[] args) {
		
		// Revers number
//		int [] a = {1,2,3,4,5};
//		
//		for(int i = a.length - 1; i>=0;i--) {
//			System.out.println(a[i] + " ");
//		}
		
		//MIN / MAX
		
		int [] arr = {5,3,7,8,9};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];
			}else if(arr[i]>max) {
				max = arr[i];
			}
		}
//		
//		for(int n: arr) {
//			if(n<min) {
//				min = n;
//			}else if(n>max){
//				max=n;
//			}
//			
//		}
		System.out.println("Min number :" + min);
		System.out.println("Max number :" + max);
		
		
	}

}
