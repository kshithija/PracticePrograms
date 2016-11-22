package com.basicprograms;
import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter some text");
String data = br.readLine();
BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter some text name1");
String data1 = br.readLine();
System.out.println("you entered below text="+data.compareTo(data1));
	}

}
