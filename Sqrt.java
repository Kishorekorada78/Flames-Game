import java.util.*;

public class Sqrt {
    public static void main(String[] args) {
          int x=1;
          System.out.println(sqrt(x));;
    }
    static int sqrt(int x){
        if(x==1)
            return 1;
        int left=1,right=x/2,result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<=x/mid){
                result=mid;
                left=mid+1;
            }
            else
                right=mid-1;
        }
        return result;
    }

}
