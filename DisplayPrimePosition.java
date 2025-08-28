
   // input: computer
   // output: o m u e

public class DisplayPrimePosition {
    public static void main(String[] args) {
        String str="computerinkns";
        for(int i=1;i<=str.length();i++){
            if(isPrime(i)){
                System.out.print(str.charAt(i-1));
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==2)
            return true;
        if(n<=1 || n%2==0)
            return false;
        for(int i=3;i*i<=n;i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
