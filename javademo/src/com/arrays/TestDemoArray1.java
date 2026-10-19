package com.arrays;

import java.util.Scanner;

//WAP to convert decimal number to octal number

public class TestDemoArray1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		String s = "";
		while(n > 0) {
			r = n % 2;
			n = n / 2;
			s = r + s;
		}
		System.out.println(s);
	}
}