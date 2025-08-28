import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner kk=new Scanner((System.in));
        int n=kk.nextInt();
        int sum=0,temp=n;
        while(n!=0)
        {
            int fact=1;
            int rem=n%10;  //4  2
            for(int i=1;i<=rem;i++) {
                fact = fact * i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not");
    }
}
