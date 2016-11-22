package com.edureka.assignment1;

import java.util.Scanner;

public class Generate_Table {

	public static void main(String[] args) {
		// Write a program to generate tables of 10.
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i=1; i <=10; i++){
			System.out.println(c+"*"+i+"="+(c*i));
			
		}
	}

}
