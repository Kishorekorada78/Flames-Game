import java.math.BigInteger;
import java.util.*;
public class BigIntegerPrimeNextPrime {
    public static void main(String[] args) {
        int n=15;
//        System.out.println(isPrime(n));
//        System.out.println(nextPrime(n));
//    }
//    public static boolean isPrime(int n)
//    {
//       BigInteger b=BigInteger.valueOf(n);
//       return b.isProbablePrime(1);
//    }
//    public static int nextPrime(int n)
//    {
//       BigInteger k=BigInteger.valueOf(n);
//       String kk=k.nextProbablePrime().toString();
//       return Integer.parseInt(kk);
        System.out.print(nextprime(n+1));
    }
    public static int nextprime(int n){
        while(true) {
            int count=0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0){
                    count++;
                    break;
                }
            }
            if(count==0 && n>1)
                return n;
            n++;
        }
    }
}
