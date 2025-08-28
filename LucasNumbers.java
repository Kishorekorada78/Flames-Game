import java.util.Scanner;
public class LucasNumbers {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        int a0=2,a1=1;
        System.out.print(a0+" "+a1+" ");
        for(int i=2;i<=n;i++)
        {
            int z=a0+a1;
            System.out.print(z+" ");
            a0=a1;
            a1=z;
        }

    }
}
