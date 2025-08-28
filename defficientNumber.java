import java.util.Scanner;
public class defficientNumber {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum++;
        }
        if(n>sum)
            System.out.println("Defficient");
        else
            System.out.println("Not");
    }
}
