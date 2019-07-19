package easy;

/**
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome when
 * it reads the same backward as forward.
 * 
 * @author LanceWu
 * 
 *         Example 1:
 * 
 *         Input: 121 Output: true Example 2:
 * 
 *         Input: -121 Output: false Explanation: From left to right, it reads
 *         -121. From right to left, it becomes 121-. Therefore it is not a
 *         palindrome. Example 3:
 * 
 *         Input: 10 Output: false Explanation: Reads 01 from right to left.
 *         Therefore it is not a palindrome.
 */
public class Solution10 {
	public static boolean isPalindrome(int x) {
    StringBuilder str=new StringBuilder(100);
    str.insert(0, x);
    return (str.toString().equals(str.reverse().toString()));
	}
	public static void main(String[] args) {
		int x = 121;
		int y = -121;
		int z = 10;	  
	System.out.println(Solution10.isPalindrome(x));
	System.out.println(Solution10.isPalindrome(y));
    System.out.println(Solution10.isPalindrome(z));
		 
	}
}
