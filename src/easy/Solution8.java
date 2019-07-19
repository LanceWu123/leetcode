package easy;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * @author LanceWu
 *
 *Example:

Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class Solution8 {
	  public static void twoSum(int[] nums, int target) {
		 
	  int []A=new int[2];
	   HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
	   for(int i=0;i<nums.length;i++) {
		   map.put(nums[i],i);
	   }
	   System.out.println(map.entrySet());
	   for(int i=0,k=0;i<map.size();i++) {
		int n=target-nums[i];
		if(!map.containsKey(n))  {continue;}
		else if(i!=map.get(n)){A[k]=i;A[k+1]=map.get(n);k+=2;break;}
	   }
	  for(int i:A) {
		  System.out.println(i);
	  }
	    }
     public static void main(String[] args) {
    	 int [] nums= {3,2,4};
    	 int target=6;
		 twoSum(nums,target);
     
	}
}
