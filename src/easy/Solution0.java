package easy;

/**
 * ClassName: Solution0
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/7/19 16:11
 * Description:
 */

public class Solution0 {
    /**
     * 将给定的字符串中的字母转化为摩丝密码，返回密码中不同种类个数
     * @author LanceWu
     *
     */
        public static int uniqueMorseRepresentations(String []words) {
            String [] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            StringBuffer buffer=new StringBuffer();
            for (int i=0;i<words.length;i++) {
                for(int j=0;j<words[i].length();j++){
                    buffer.append(morse[words[i].charAt(j)-97]);
                }
                words[i]=buffer.toString();
                buffer.delete(0, buffer.length());
            }
            for(int i=0;i<words.length;i++) {
                System.out.println(words[i]);}
            int len=words.length;
            for(int i=0;i<words.length;i++) {
                for(int j=i+1;j<words.length;j++) {
                    if(words[i].equals(words[j]))
                    { len--;
                        break;}
                }
            }
            return len;
        }
        public static void main(String[] args) {
            String []words= {"gin", "zen", "gig", "msg"};
            System.out.println("密码种类有："+uniqueMorseRepresentations(words)+"种");
        }
    }

