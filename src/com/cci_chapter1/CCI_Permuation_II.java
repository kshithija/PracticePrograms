/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other*/


/*
Solution #2: Check if the two strings have identical character counts.
We can also use the definition of a permutation-two words with the same character counts-to implement
this algorithm. We simply iterate through this code, counting how many times each character appears.
Then, afterwards, we compare the two arrays. 
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
