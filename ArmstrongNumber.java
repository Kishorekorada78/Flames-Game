import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        int arm=0 , orginal=n;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            arm=arm+rem*rem*rem;
        }
        if(arm==orginal)
            System.out.print("Armstrong Number");
        else
            System.out.println("Not A Armstrong number");
    }
}
