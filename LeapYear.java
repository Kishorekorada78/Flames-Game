 import  java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int year=kk.nextInt();
        if(year%400==0 ||(year%4==0 && year%100!=0))
            System.out.print(year+" Leap year");
        else
            System.out.print(year+" not a Leap year");
    }
}

