package com.basicprograms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Dynamic Array
public class Main {
	
	private static ArrayList<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
	
	private static int lastans = 0;
	private static int n = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int q = sc.nextInt();
        for(int j = 0; j < n; j++) {
        	ArrayList<Integer> empty = new ArrayList<Integer>(0);
        	sequences.add(empty);
        }
        
        for(int i = 0; i < q; i++) {
        	
        	int op = sc.nextInt();
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	switch (op) {
        	case 1:
        		insert( x, y);
        		break;
        	case 2:
        		print( x, y);
        		break;
        	default:
        		break;
        	}
        }
        sc.close();
    }

	private static void print(int x, int y) {
		int index = select(x);
		ArrayList<Integer> seq = sequences.get(index);
		int position = y % seq.size();
		lastans = seq.get(position);
		System.out.println(lastans);
	}

	private static int select(int x) {
		int xor = x ^ lastans;
		int index = xor % n;
		return index;
	}

	private static void insert(int x, int y) {
		int index = select(x);
		ArrayList<Integer> seq = sequences.get(index);
		seq.add(y);
	}

}