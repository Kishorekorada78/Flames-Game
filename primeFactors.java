import java.util.*;
import java.io.*;
public class primeFactors {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=kk.nextInt();  //100
        for(int i=2;i<=n;i++) {
            if (isPrime(i)) {
                while(n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

}
