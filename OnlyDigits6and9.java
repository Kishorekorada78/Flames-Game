import java.util.*;
public class OnlyDigits6and9 {
    public static void main(String[] args) {
        int n=699;
        System.out.println(result(n));
    }
    public  static int result(int n){
        int addnum=n+1;   //100
        while(true){
            if(isCorrect(addnum))
                return addnum;
            addnum++;
        }
    }
    public static boolean isCorrect(int check){
        while(check>0) {
            int rem = check % 10; //0
            if (rem != 6 && rem != 9)
                return false;
            check/=10;
        }
        return true;
    }
}
