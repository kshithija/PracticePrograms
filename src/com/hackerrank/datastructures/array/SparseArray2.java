package com.hackerrank.datastructures.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArray2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //To enter N 
        int n = Integer.parseInt(scanner.nextLine());
        
        //using HashMap to enter N Strings
        HashMap<String, Integer> tokens = new HashMap<String, Integer>();
        for (int i = 0; i < n; i ++) {
            String line = scanner.nextLine();
            if (tokens.containsKey(line)) {
                tokens.put(line, tokens.get(line) + 1);
            } else {
                tokens.put(line, new Integer(1));
            }
        }
        int q = Integer.parseInt(scanner.nextLine());
        int[] counts = new int[q];
        for (int i = 0; i < q; i ++) {
            String line = scanner.nextLine();
            Integer count = tokens.get(line);
            System.out.println(count == null ? 0 : count.intValue());
        }
    }
}