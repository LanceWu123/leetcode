package easy;
import java.util.Stack;
/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
 * @author LanceWu
 *
 *Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class Solution11 {
	 public static boolean isValid(String s) {
	        Stack<Character> st=new Stack<Character>();
	        for(int i=0;i<s.length();i++) {	        	
	        if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {st.push(s.charAt(i));}
	        else{
	        	if (st.empty()) {return false;}
	        	else if(s.charAt(i)==')'&&st.peek()=='(') {st.pop();}
	        	else if(s.charAt(i)==']'&&st.peek()=='[') {st.pop();}
	        	else if(s.charAt(i)=='}'&&st.peek()=='{') {st.pop();}
	        	else {return false;}
	        }
	    }
	       if(!st.empty()) return false;
	       return true;
}
	 
	 
	 public static void main(String[] args) {
		String s1="()";
		String s2="()[]{}";
		String s3="(]";
		String s4="([)]";
		String s5="{[]}";
	    System.out.println(Solution11.isValid(s1));
	    System.out.println(Solution11.isValid(s2));
	    System.out.println(Solution11.isValid(s3));
	    System.out.println(Solution11.isValid(s4));
	    System.out.println(Solution11.isValid(s5));
	 } 
}