package com.programming.simplified.org;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int temp;
		int a = sc.nextInt();
		int b = sc.nextInt();
		 System.out.println("Before swapping"+a+"&"+b);
		temp = a;
		 a = b;
	    	b = temp;
		 System.out.println("Before swapping"+a+"&"+b);
	}

}
