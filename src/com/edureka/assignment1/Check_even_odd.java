package com.edureka.assignment1;

import java.util.Scanner;

public class Check_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		if (c%2==0){
			System.out.println(c+" is Even");
		}
		else
		{
			System.out.println(c+" is odd");
		}
	}

}
