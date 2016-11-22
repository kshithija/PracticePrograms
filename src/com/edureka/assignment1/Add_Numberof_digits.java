package com.edureka.assignment1;

import java.util.Scanner;

public class Add_Numberof_digits {

	public static void main(String[] args) {
		// Write a program to add the digits of a number
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of digits");
		int i,sum = 0, r;
		int c = sc.nextInt();
		for(i=0;i<=c;i++){
		 
			
		 sum = sum + c%10;
		 c = c/10;
		 
		
		}
		
		System.out.println(sum);
		
		
	}

}
