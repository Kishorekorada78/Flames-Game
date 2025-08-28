// ip=abedrugh123;
// op=abdrgh123
public class ExceptVowels {
    public static void main(String[] args) {
        String str="abcde123fi";
        int n=str.length();
        StringBuilder sb=new StringBuilder();
       // String vow="aeiou";
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if("aeiouAEIOU".indexOf(ch)==-1)
                sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
