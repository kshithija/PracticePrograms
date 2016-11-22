package com.basicprograms;

import java.io.*; 
import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] n = new int[10];
        int t;
        int sum;
        StringBuilder sb =new StringBuilder();

        Scanner iput = new Scanner(System.in);

        t = Integer.parseInt(iput.nextLine());

        if (t <= 500) {

            for (int i = 0; i < t; i++) {
                a[i] = Integer.parseInt(iput.next());
                b[i] = Integer.parseInt(iput.next());
                n[i] = Integer.parseInt(iput.next());
                iput.nextLine();
            }
        } else
            System.out.println("Enter value less than 500");

        if (t <= 500) {

            for (int i = 0; i < t; i++) {

                if (a[i] <= 50 && b[i] <= 50 && n[i] <= 15 && n[i] != 0) {

                    for (int j=0;j<n[i];j++) {

                        sum = a[i];

                        for (int k = j;k >=0; k--) {

                            sum+=Math.pow(2,k)*b[i];
                        }
                        sb=sb.append(Integer.toString(sum)).append(" ");
                    }
                    System.out.println(sb);
                    sb.delete(0,sb.toString().length());
                } else
                    System.out.println("Enter the values within the allowed limits");
            }
        }
    }    
	
	
	
	

}
