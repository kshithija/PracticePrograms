package hackerrank.java.org;

import java.util.Scanner;

public class Java_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a=0,b=0, n=0;
		
		
		int tests = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < tests; k++)
        {
            String[] inputs = sc.nextLine().split(" ");
            a = Integer.parseInt(inputs[0]);
            b = Integer.parseInt(inputs[1]);
           n = Integer.parseInt(inputs[2]);
		
           int y=0, sum=0;
		for(int j=0 ; j<n ; j++){
			
			y = y+ (int)Math.pow(2,j)*b;
			sum = a +y;
			System.out.print(sum+" ");
		
		}System.out.println();

	}}}


