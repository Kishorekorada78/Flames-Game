import java.util.*;
  // input: AC2ZK3
  // output: ABCKZ5
public class Rearrange {
    public static void main(String[] args) {
        String str="AC2ZK3";
        TreeSet<Character> set=new TreeSet<>();
         int sum=0;
         for(int i=0;i<str.length();i++) {
             char ch = str.charAt(i);
             if (ch >= 65 && ch <= 91)
                 set.add(ch);
             else {
                 String s="";
                  s += ch;
                 int n = Integer.parseInt(s);
                 sum += n;
             }
         }
         StringBuilder sb=new StringBuilder();
         for(char ch:set)
              sb.append(ch);
         String string=sb.toString()+String.valueOf(sum);
       //  string+=String.valueOf(sum);
         System.out.println(string);
    }
}
