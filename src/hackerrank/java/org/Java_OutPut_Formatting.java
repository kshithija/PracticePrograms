package hackerrank.java.org;

import java.util.Scanner;

public class Java_OutPut_Formatting {
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
//             String line = String.format("%1$-15s", s1, "%03d", x);
//             String y = String.format("%03d", x);
//	            System.out.print(line+y+"\n");
             
             System.out.printf( "%-15s%03d %n", s1, x);
             
         }
         System.out.println("================================");

 }

}
