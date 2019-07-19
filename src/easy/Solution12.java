package easy;
/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
Return the quotient after dividing dividend by divisor.
The integer division should truncate toward zero.
 * @author LanceWu
 *
 *Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
 */
public class Solution12 {
public static int divide(int dividend, int divisor) {
        int sub=Math.abs(dividend);
        int k=0;
        while(sub>=Math.abs(divisor)) {
        	sub=sub-Math.abs(divisor);
        	k++;
        }
       try {
    	   if(dividend*divisor<0) {return -k;}
    	   else {return k;}
       }
       catch(NumberFormatException e){
    	   return Integer.MAX_VALUE;
       }
        }

public static void main(String[] args) {
	int div1=10,div2=3,div3=7,div4=-3;
	System.out.println(Solution12.divide(div1, div2));
	System.out.println(Solution12.divide(div3, div4));
}
}
