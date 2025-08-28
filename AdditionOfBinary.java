import java.util.*;
public class AdditionOfBinary {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        String str1=kk.next();  //1000
        String str2=kk.next();  //1110
        while(str1.length()>str2.length())
            str2="0"+str2;
        while(str2.length()>str1.length())
            str1="0"+str1;
        System.out.println(str1);
        System.out.println(str2);
        int cary=0;
        StringBuilder result=new StringBuilder();
        for(int i=str1.length()-1;i>=0;i--){
            int x1=str1.charAt(i)-'0';
            int x2=str2.charAt(i)-'0';
            int sum=x1+x2+cary;
            result.append(sum%2);
            cary=sum/2;
        }
        if(cary!=0)
            result.append("1");
        System.out.println(result);
        System.out.println(result.reverse());

//        String b1=kk.next();
//        String b2=kk.next();
//        int carry=0;
//        while(b1.length()>b2.length()){
//            b2="0"+b2;
//        }
//        while(b2.length()<b1.length()){
//            b1="0"+b1;
//        }
//        String str="";
//        int a1=Integer.valueOf(b1);
//        int a2=Integer.valueOf(b2);
//        int n=b1.length();
//        while(n!=0){
//            int rem1=a1%10;
//            int rem2=a2%10;
//            int sum=rem1+rem2+carry;
//            if(sum==2){
//                str+="0";
//                carry=1;
//            } else if (sum==3) {
//                str+="1";
//                carry=1;
//            } else if (sum==1) {
//                str+="1";
//            }else
//                str+="0";
//            a1=a1/10;
//            a2=a2/10;
//            n--;
//        }
//        if(carry==1)
//            str+="1";
//        String str2="";
//        for(int i=str.length()-1;i>=0;i--){
//            str2+=str.charAt(i);
//
//        }
//        System.out.println(str2);
    }
}
