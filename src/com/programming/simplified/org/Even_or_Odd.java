package com.programming.simplified.org;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n;
			System.out.println("Enter a number");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
			for(i=1;i<=n;i++){
				
				if(i%2==0){
					System.out.println(i+"Even");
				}
				else if(i%2!=0){
					System.out.println(i+"odd");
				}
			}
			/*if(n%2==0){
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}*/
	}

}
