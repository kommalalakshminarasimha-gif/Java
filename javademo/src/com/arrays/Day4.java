package com.arrays;

public class Day4 {

	public static void main(String[] args) {
		
		int [] arr = {99,98,97,96,95,94};
		System.out.println(arr);
		
		double total_arr = 0;
	    double avg = 0;
		
		for(int m:arr) {
			total_arr = total_arr + m;
		}
		
		avg = total_arr/arr.length;
		
		
		System.out.println("Total Marks :" + total_arr );
		System.out.println("Avg of all arr :" + avg);
		

	}

}
