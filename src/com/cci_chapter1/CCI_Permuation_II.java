/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other*/

/*
Like in many questions, we should confirm some details with our interviewer. We should understand if the
permutation comparison is case sensitive. That is: is God a permutation of dog? Additionally, we should
ask if whitespace is significant. We will assume for this problem that the comparison is case sensitive and
whitespace is significant. So, "god " is different from "dog".
Observe first that strings of different lengths cannot be permutations of each other. There are two easy
ways to solve this problem, both of which use this optimization.
Solution #1: Sort the strings.
If two strings are permutations, then we know they have the same characters, but in different orders. Therefore,
sorting the strings will put the characters from two permutations in the same order. We just need to
compare the sorted versions of the strings. 

*/


import java.util.Scanner;

public class CCI_Permuation_II {
	
	boolean permutation(String s, String t){
		if(s.length() != t.length())
			return false;
		
		int[] letters = new int[128];
		for(int i=0;i<s.length();i++){
			
			letters[s.charAt(i)]++;
		
		}
		
		for(int i=0;i<t.length();i++){
			letters[t.charAt(i)]--;
			if(letters[t.charAt(i)]<0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str=sc.nextLine();
		System.out.println("Enter second string");
		String str1=sc.nextLine();
		CCI_Permuation_II c = new CCI_Permuation_II();
		
		System.out.println(c.permutation(str,str1)); 
	}

}
