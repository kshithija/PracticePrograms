package hackerrank.java.org;

import java.util.Scanner;

public class Java_End_of_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "ikikik";
isUniqueChars(str);

	}
	public static boolean isUniqueChars(String str){
		
		if(str.length() > 128)
			return false;
		
		boolean[] char_set = new boolean[128];
		for(int i=0; i < str.length(); i++){
			int val = str.charAt(i);
			if(char_set[val]){
				System.out.println("unique");
				return false;
			
			}
			char_set[val] = true;
			System.out.println("unique not");
		}
		
		return true;
		
	}

}
