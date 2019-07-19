package easy;

import java.util.Arrays;

/**
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
   The move sequence is represented by a string, and the character moves[i] represents its move. Valid moves are R (right), L (left), U (up), and D (down). 
   If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
 * @author LanceWu
 *
 *Example 1:

Input: "UD"
Output: true 
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
 

Example 2:

Input: "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
 */

public class Solution3 {
	
public boolean judgeCircle(String moves) {
    int []A= {0,0};   
    int []B= {0,0};
    for(int i=0;i<moves.length();i++) {
    	switch(moves.charAt(i)) {
    	case 'U':B[1]++;break;
    	case 'D':B[1]--;break;
    	case 'L':B[0]--;break;
    	case 'R':B[0]++;break;
    	}	
    }
 return Arrays.equals(A, B);


  
    }
public static void main(String[] args) {
	String m="UD";
	String n="LL";
	Solution3 s=new Solution3();
System.out.println(s.judgeCircle(n));
System.out.println(s.judgeCircle(m));
	
}
}
