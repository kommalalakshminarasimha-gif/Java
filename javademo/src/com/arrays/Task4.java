package com.arrays;

public class Task4 {

	public static void main(String[] args) {
		
		int[] a = {2, 1, 5, 6, 2, 3};
		int max = 0;
		
		for(int i = 0; i<a.length; i++) {
			int count=0;
			for(int j=i-1;j>0;j--) {
				if(a[i]<a[j]) {
					count++;
				}
			}
			for(int k=i; k<a.length;k++ ) {
				if(a[i]<=a[k]) {
					count++;
				}
			}
			int size=count*a[i];
			if(size>max) {
				max=size;
			}
		
		}
		System.out.println("Max num is :" +max);

	}

}
