package com.operators;
//Arithmetic	      +, -, *, /, %	          a + b
//Assignment	      =, +=, -=, *=, /=	      a = 10
//Comparison	      ==, !=, >, <, >=, <=	  a > b
//Logical	           &&, ||, !	           a > 5 && b < 10
//Increment/Decrement   ++, --	               a++
//Ternary	             ? :	              a > b ? a : b
//Bitwise	             &, |, ^, ~	          a & b


public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a + b);  // 15
        System.out.println(a - b);  // 5
        System.out.println(a * b);  // 50
        System.out.println(a / b);  // 2
        System.out.println(a % b);  // 0

        System.out.println(a > b);   // true
        System.out.println(a == b);  // false
    }
}