/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. */

package co.kshithi.practiceprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetCode_Two_Sum_Using_Map_HashMAP {

	public int[] twoSum(int[] nums, int target) {
		 Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0; i<nums.length;i++){
	            int complement = target - nums[i];
	            if(map.containsKey(complement)){
	                return new int[]{map.get(complement),i};
	            }
	            map.put(nums[i],i);
	        }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	
/*    public static void main(String[] args) {
        int[] s = {2, 7, 11, 15};
        int value = 9;
        example r = new example();
        int[] a = r.twoSum(s,value);
        System.out.println(Arrays.toString(a));
    }*/
    
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of arrays");
        int n = in.nextInt();
        System.out.println("enter array elements");
        int[] nums = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
        	nums[ar_i] = in.nextInt();
        }
        System.out.println("enter target");
        int target = in.nextInt();
        LeetCode_Two_Sum_Using_Map_HashMAP r = new LeetCode_Two_Sum_Using_Map_HashMAP();
        int[] result = r.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
	}

