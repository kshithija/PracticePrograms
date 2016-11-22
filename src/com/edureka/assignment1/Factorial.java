package com.edureka.assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Write a program to find factorial of a number.
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=c;i++){
		fact= fact*i;
		}
		System.out.println(fact);
	}

}
