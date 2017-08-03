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
