package co.kshithi.practiceprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetCode_Palindrome {

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
	        
	        int n = in.nextInt();
	       
	        
	        LeetCode_Palindrome r = new LeetCode_Palindrome();
	        int result = r.twoSum(n);
	        if(n==result){
	        	System.out.println("palindrome");
	        }
	        else
	        {
	        	System.out.println("not palindrome");
	        }
	    }
	}
