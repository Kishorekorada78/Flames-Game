/*
  (a+2^0*b),(a+2^1*b),(a+2^2*b),......n times
  input :
  2
  0 2 10    first iteration
  5 3 5     second iteration
  output:
  2 6 14 ....
  8 14 ......
  explaination:
  s0=0+1*2=2
  s1=0+1*2+2*2=6
  s2=0+1*2+2*2+4*2=14
  ......
 */
import java.util.Map;
import java.util.Scanner;
import java.io.*;
public class Hackerrank1 {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int t=kk.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=kk.nextInt();
            int b=kk.nextInt();
            int n=kk.nextInt();
            int sum=a;
            for(int j=0;j<n;j++)
            {
                sum=sum+(int) Math.pow(2,j)*b;
                System.out.print(sum+ " ");
            }
            System.out.println();
        }
    }

}
