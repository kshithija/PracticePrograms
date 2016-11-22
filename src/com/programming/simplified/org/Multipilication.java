package com.programming.simplified.org;

import java.util.Scanner;

public class Multipilication {
	
	public static void main(String args[]){
		int n,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		n = sc.nextInt();
		System.out.println("Multiplication table of "+n+" is :-");
		for(c=1; c<=10; c++){
			System.out.println(n+"*"+c+"="+(n*c));
		}
		
	}

}
