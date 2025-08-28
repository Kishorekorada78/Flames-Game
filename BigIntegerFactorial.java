import java.math.BigInteger;
public class BigIntegerFactorial {
    public static void main(String[] args) {
        int n=100;
        System.out.println(fact(n));
    }
    public static BigInteger fact(int n)
    {
        BigInteger f=BigInteger.ONE;
        for(int i=2;i<=n;i++)
        {
            BigInteger x=BigInteger.valueOf(i);
            f=f.multiply(x);
        }
        return f;
    }

}
