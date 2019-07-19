package easy;
/**
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
   Return the element repeated N times.
 * @author LanceWu
 *Example:

Input: [1,2,3,3]
Output: 3


Input: [2,1,2,5,3,2]
Output: 2


Input: [5,1,5,2,5,3,5,4]
Output: 5
 */
public class Solution1 {
	public int repeatedNTimes(int[] A) {
        int n=A.length/2;
        int sum=1;
        int k=0;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]) sum++;
            }
            if(sum==n) {k=i;break;}
            else {sum=1;}
        }  
        return A[k];
    }
	public static void main(String[] args) {
		int []A= {1,2,3,3};
		Solution1 s=new Solution1();
		System.out.println(s.repeatedNTimes(A));
	}
}

