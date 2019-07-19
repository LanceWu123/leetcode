package easy;

/**
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
You may return any answer array that satisfies this condition.
 * @author LanceWu
 *
 *Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 */

public class Solution7 {
public void sortArrayByParityII(int[] A) {
        int []n=new int[A.length];
        int j=0;
        for(int i=0;i<A.length;i++) {
        	if (A[i]%2==0) {
        		n[j]=A[i];
        		j+=2;
        	}
        }
        j=1;
        for(int i=0;i<A.length;i++) {
        	if (A[i]%2!=0) {
        		n[j]=A[i];
        		j+=2;
        	}
       }
       for(int i:n ) {
    	   System.out.print(" "+i);
       }
    }

public static void main(String[] args) {
	int A[]= {4,2,5,7};
	Solution7 s=new Solution7();
	s.sortArrayByParityII(A);
}
}
