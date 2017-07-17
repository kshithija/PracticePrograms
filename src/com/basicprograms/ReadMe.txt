--> indexOf():
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


--> toUpperCase():
Description
This method has two variants. The first variant converts all of the characters in this String to upper case using the rules of the given Locale. This is equivalent to calling toUpperCase(Locale.getDefault()).

Example
import java.io.*;
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.toUpperCase() );
   }
}
This will produce the following result −

Output
Return Value :WELCOME TO TUTORIALSPOINT.COM


--> subString():
This method has two variants and returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string or up to endIndex – 1, if the second argument is given.

Example
import java.io.*;
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10) );
      System.out.print("Return Value 2:" );
      System.out.println(Str.substring(10, 15) );

   }
}
This will produce the following result −

Output
Return Value : Tutorialspoint.com
Return Value 2 : Tuto

--> charAt():
This method returns the character located at the String's specified index. The string indexes start from zero.

Example
public class Test {

   public static void main(String args[]) {
      String s = "Strings are immutable";
      char result = s.charAt(8);
      System.out.println(result);
   }
}
This will produce the following result −

Output
a
