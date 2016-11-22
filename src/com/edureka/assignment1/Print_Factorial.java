package com.edureka.assignment1;

import java.util.Scanner;

public class Print_Factorial {

	public static void main(String[] args) {
		// print factorial numbers
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=c;i++){
		fact= fact*i;
		System.out.println(fact);
		}

	}

}
