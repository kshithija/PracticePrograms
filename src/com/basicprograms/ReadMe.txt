indexOf():
This method returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.

Example
import java.io.*;
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( 'o' ));
   }
}
This will produce the following result −

Output
Found Index :4
