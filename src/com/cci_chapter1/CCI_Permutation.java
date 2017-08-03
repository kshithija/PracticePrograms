import java.util.Scanner;

public class CCI_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str=sc.nextLine();
		System.out.println("Enter second string");
		String str1=sc.nextLine();
		CCI_Permutation c = new CCI_Permutation();
		
		System.out.println(c.permutation(str,str1)); 
	}

	boolean permutation (String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	String sort(String s){
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	

}
