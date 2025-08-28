import java.util.*;
//You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn.
// That is the string is valid only if equal number of y's follow equal number of x's.
//        Return 1 if valid else 0.
//As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

public class PatternMatcher {
    public static void main(String[] args) {
        String s="xxyyxyy";
        System.out.print(follPatt(s));
    }
        static int follPatt(String s) {
            // Your code here
            char[] ch=s.toCharArray();
            boolean flag=true;
            int n=ch.length;
            for(int i=0;i<n;i++)
            {
                if(ch[i]!='x'){
                    flag=false;
                    break;
                }
                int countX=1,countY=0;
                while(i+1<n && ch[i+1]=='x'){
                    ++i;
                    ++countX;
                }
                while(i+1<n && ch[i+1]=='y'){
                    ++i;
                    ++countY;
                }
                if(countX!=countY)
                {
                    flag=false;
                    break;
                }
            }
            return (flag)?1:0;

    }
}
