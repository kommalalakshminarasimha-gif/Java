package com.arrays;

public class Frequency {

    public static void main(String[] args) {
    	
        int[] a = {10, 20, 10, 30, 20, 10, 40};

        for (int i = 0; i < a.length; i++) {

            int count = 1;

            // Check whether the element was already counted
            
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count frequency
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            System.out.println(a[i] + " = " + count);
        }
    }
}