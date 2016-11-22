package com.edureka.assignment1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci 2 3 5 8 13 21 34
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int fib1 = 0, fib2 =1, fib3;
		for(int i=0; i <=c ; i++){
			fib3 = fib1 + fib2;
			if(fib3!=1)
				{System.out.println(fib3);}
			fib1 = fib2;
			fib2= fib3;
		}
		
	}

}
