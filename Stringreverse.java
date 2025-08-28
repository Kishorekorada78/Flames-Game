import java.util.*;
public class Stringreverse{
    public static void main(String[] args) {
        String str1="Money makes many things";
        char ch;
        int count=1;
        int result=str1.length();
        for(int i=0;i<result;i++)
        {
            if(str1.charAt(i)==' ' && str1.charAt(i+1)!=' ')
                count++;
            //System.out.print(count);
        }
        System.out.print(count);
    }
}
