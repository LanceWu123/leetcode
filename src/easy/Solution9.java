package easy;
/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * @author LanceWu
 *

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 */
public class Solution9 {
	public static int reverse(int x) {
       String str=String.valueOf(x);
       StringBuffer buf=new StringBuffer();
       if(str.charAt(0)=='-') {buf.append('-');}
       for(int i=str.length()-1;i>0;i--) {
    	   if(i==str.length()-1&&str.charAt(str.length()-1)=='0') {continue;}
    	   buf.append(str.charAt(i));
       }
       if(str.charAt(0)!='-') {buf.append(str.charAt(0));}
      try {
    	  return Integer.valueOf(buf.toString());
      }
      catch (NumberFormatException e) {
	return 0;
	}
   }	
	
	public static void main(String[] args) {
		int x=123;
		int y=-123;
		int z=120;
		int w=-120;
		int v=1534236469;
		System.out.println(Solution9.reverse(x));
	    System.out.println(Solution9.reverse(y));
	    System.out.println(Solution9.reverse(z));
	    System.out.println(Solution9.reverse(w));
	    System.out.println(Solution9.reverse(v));
	}
}
