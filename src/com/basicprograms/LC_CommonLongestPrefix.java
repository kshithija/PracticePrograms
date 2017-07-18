

import java.util.Scanner;

public class LC_CommonLongestPrefix {

	
/*// geeks, gers, geers
	 public String longestCommonPrefix(String[] strs) {
		 // check the string is null or empty if it is empty return ""
	        if(strs == null || strs.length == 0)    return "";
	        // taking a string pre to print results and assigning array string first element and also initalizing int i as 1 for loop
	    String pre = strs[0]; 
	    int i = 1;
	    while(i < strs.length){
	    	
	        while(strs[i].indexOf(pre) != 0)
	            pre = pre.substring(0,pre.length()-1);
	        i++;
	    }
	    return pre;
	    }
		 */
	 
	 public String longestPrefix(String[] str){
		 
		 if(str == null || str.length == 0){
			 return "";
		 }
		 String result = str[0];
		 for(int i=0;i<str.length;i++){
			 if(str[i].indexOf(result) != 0){
				 result = result.substring(0,result.length()-1);
			 }
		 }
		 
		 return result;
	 }
	 
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter n");
			int n = sc.nextInt();
			System.out.println("enter arrya elements");
			String[] strs = new String[n];
	        for(int i = 0; i<n; i++){
	        	strs[i] = sc.next();
	        }
	        
	        LC_CommonLongestPrefix s = new LC_CommonLongestPrefix();
	        System.out.println(s.longestPrefix(strs));
			
		}
		
	}


