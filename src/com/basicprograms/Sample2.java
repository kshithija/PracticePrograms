package com.basicprograms;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
//// %-14s left-justified from o to 14 for string
            // %03d padded with leading zero for int
            System.out.printf("%-14s %03d %n", s1, x);  
        }
        System.out.println("================================");

		
	}

}
