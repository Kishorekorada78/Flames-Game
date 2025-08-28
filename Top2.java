// prime or not
import java.util.Scanner;
public class Top2 {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        isprime(n);
    }
    public static void isprime(int n){
        boolean prime=true;
        if(n<2) {
            return ;
        //System.exit(n);
        }
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
            System.out.println("Not a prime");
        else
            System.out.println("prime");
    }

}
