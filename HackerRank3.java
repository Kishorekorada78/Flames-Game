/*
import java.util.Scanner;
import java.io.*;
public class HackerRank3 {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        String str = kk.next();
        int n = str.length();
        try {
            if (n % 2 == 0) {
                int count = 0;
                String str1 = str.substring(0, n / 2);  // mad
                String str2 = str.substring((n / 2), n);  // ams
                for (int i = 0; i < str1.length(); i++) {
                    for (int j = 0; j < str2.length(); j++) {
                        if (str1.charAt(i) == str2.charAt(j))
                            count++;
                    }
                }
                System.out.println(str1.length() - count);
            }
        } catch (NumberFormatException e) {
            System.out.println("Exception occurs");
        }
    }
}   */
import java.util.Scanner;
import java.util.Arrays;
public class HackerRank3 {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        String str = kk.next();
        int result = (getvalue(str));
        if(result!=-1)
            System.out.println(result);
        String s1="Ksdns";
        char[] ch=s1.toCharArray();
        s1=new String(ch);
    }

    public static int getvalue(String str) {
        int n = str.length();
        int count = 0;
        if (n % 2 == 0) {
            String str1 = str.substring(0, n / 2);
            String str2 = str.substring(n / 2, n);
            char[] str3 = str1.toCharArray();
            char[] str4 = str2.toCharArray();
            Arrays.sort(str3);
            Arrays.sort(str4);
            for (int i = 0; i < str3.length; i++) {
                if (str3[i] != str4[i])
                    count++;
            }
        } else
            return -1;
        return count;

    }
}
