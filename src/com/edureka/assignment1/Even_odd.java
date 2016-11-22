package com.edureka.assignment1;

public class Even_odd {
	
// Write a program to print 10 even numbers and 10 odd numbers.

	public static void main(String[] args) {
		// for loop
/*	for (int i=1; i <=10; i++){
		if(i%2==0){
			System.out.println("Even numbers : "+i);
	}
	}
	for (int j=1; j<=10; j++){
		if(j%2!=0){
			System.out.println("odd numbers : "+j);
		}
		
	
	} */
	/*	
		//while loop
		int i=1;
		while(i<=10){
			if(i%2==0){
				System.out.println("Even numbers : "+i);
		}
			i++;
		}
		
		int j=1;
		while(j<=10){
			if(j%2!=0){
				System.out.println("odd numbers : "+j);
		}
			j++;
		}
 */
		
		int i=1;
		do{
			if(i%2==0){
				System.out.println("Even numbers : "+i);
		}
			i++;
		}while(i<=10);
		
		int j=1;
		do{
			if(j%2!=0){
				System.out.println("odd numbers : "+j);
		}
			j++;
		}while(j<=10);
		
}
}