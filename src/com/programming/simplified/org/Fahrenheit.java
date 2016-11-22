package com.programming.simplified.org;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n;
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
	n = ((n-32)*5)/9;
	System.out.println("Fahrenheit"+n);
	
	}

}
