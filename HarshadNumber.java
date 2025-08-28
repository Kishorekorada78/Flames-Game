import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();   //24
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            int rem=n%10;  //4  2
            sum+=rem;  //4  6
            n=n/10;  //2  0
        }
        if(temp%sum==0)
            System.out.print("Harshad number");
        else
            System.out.print("Not");
    }
}
