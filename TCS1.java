import java.util.*;
public class TCS1 {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        int n = kk.nextInt();  //5
        int count = 0, num = 2,a,b;
        while (count < n) {  //0<10
            if (isPrime(num)) {
//                System.out.print(num+" ");
                count++;
            }
            num++;
        }
       num--;  //11
//        // System.out.print(num+" ");
        int original=num;
        int temp=original;
        while(temp>=10)  //10>=10
        {
          int  c=0;
            while(temp!=0)   //11!=0 true 1!=0 true
            {
                a=temp%10;  // a=1  1 9 2
                c=c+a;     // 0+1=1  2 9 11
                temp=temp/10;  // 1   0 2 0
            }
            temp=c;   // 10=2 11
        }
        System.out.print(temp*original);
    }
       public static boolean isPrime(int number)
        {
            for(int i=2;i<=Math.sqrt(number);i++)
            {
                if(number%i==0)
                    return false;
            }
            return true;
        }

    }


