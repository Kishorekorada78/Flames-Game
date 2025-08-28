
import java.util.*;
class primeOrNot{
    public static void main(String[] args) {
        //int flag=0;
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        if(Isprime(n))
        System.out.println("Prime");
        else
            System.out.println(" NotPrime");
    }
    public  static boolean Isprime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }

}
