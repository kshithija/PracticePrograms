package com.basicprograms;
import java.lang.*;
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       // int x=sc.nextInt();

		int x = Integer.parseInt(sc.nextLine());
        double y = sc.nextDouble();
        sc.skip("[\r\n]+");
        String s = sc.nextLine();
        
        //Complete this code

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
		
		
		
	}

}
