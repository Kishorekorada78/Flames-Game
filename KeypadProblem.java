import java.util.*;
public class KeypadProblem {
   public static final String[] keypad={
            "2","22","222",
            "3","33","333",
            "4","44","444",
            "5","55","555",
            "6","66","666",
            "7","77","777","7777",
            "8","88","888",
            "9","99","999","9999"
    };
    public static void main(String[] args) {
        String str="name";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch==' ')
                sb.append(0);
            else{
                sb.append(keypad[ch-'a']);
            }
        }
        System.out.println(sb.toString());
    }
}
