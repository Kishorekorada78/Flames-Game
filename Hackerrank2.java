/*
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
 */

 import java.util.*;
import java.io.*;
 public class Hackerrank2{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)
                    System.out.println("* short");
                if(x<=Integer.MAX_VALUE && x>=Integer.MIN_VALUE)
                    System.out.println("* int");
                if(x<=Long.MAX_VALUE && x>=Long.MIN_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
