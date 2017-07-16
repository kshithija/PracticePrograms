/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

*/

package co.kshithi.practiceprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetCode_Reverse_Integer {

	public int twoSum(int n){
		
		int reverse =0;
		while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
		return reverse;
	}
	
		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("enter number of arrays");
	        int n = in.nextInt();
	        System.out.println("enter array elements");
	        
	        LeetCode_Reverse_Integer r = new LeetCode_Reverse_Integer();
	        int result = r.twoSum(n);
	        System.out.println(result);
	    }
	}
