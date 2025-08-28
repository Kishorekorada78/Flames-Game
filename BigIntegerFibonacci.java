import java.math.BigInteger;
public class BigIntegerFibonacci {
    public static void main(String[] args) {
        int fib=500;
        System.out.println(fibona(fib));
    }
    public static BigInteger fibona(int fib)
    {
        BigInteger k=BigInteger.valueOf(0);
        BigInteger i=BigInteger.valueOf(1);
        BigInteger s;
        for(int j=2;j<=fib;j++)
        {
            s=k.add(i);
            k=i;
            i=s;
        }
        return i;
    }

}
