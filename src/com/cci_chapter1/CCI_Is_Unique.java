import java.util.Scanner;

public class CCI_Is_Unique {

	boolean isUniqueChars(String str){
		if(str.length() > 128)
			return false;
		
		boolean[] char_set = new boolean[128];
		for(int i=0; i < str.length();i++){
			int val = str.charAt(i);
		//	System.out.println(str.charAt(i));
		//	System.out.println(val);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCI_Is_Unique c = new CCI_Is_Unique();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(c.isUniqueChars(str));
		
	}

}
