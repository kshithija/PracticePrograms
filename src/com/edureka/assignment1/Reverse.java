package com.edureka.assignment1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// Write a program to reverse the digits of a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int reverse=0;
		 while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	  
		
		System.out.println(reverse);
	}

}
