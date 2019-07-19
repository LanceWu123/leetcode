package easy;


/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

 * @author LanceWu
Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 *
 */

public class Solution2 {
	    public static void sortedSquares(int[] A) {
	    	for(int i=0;i<A.length;i++) {
		        A[i]*=A[i];
		        }
	     
	        for(int i=0;i<A.length-1;i++) {
	        	for(int j=i+1;j<A.length;j++) {
	        		int temp;
	        		if (A[i]>A[j]) {
	        			temp=A[i];
	        			A[i]=A[j];
	        			A[j]=temp;
	        		}
	        	}
	        }
	        
	        for(int i=0;i<A.length;i++) {
	        System.out.print(" "+A[i]);
	        }
	    }
	    
	    public static void main(String[] args) {
			int []A= {-4,-1,0,3,10};
			sortedSquares(A);
		}
	}

