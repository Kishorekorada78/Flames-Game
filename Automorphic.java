
import java.util.*;
public class Automorphic {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        String tem= String.valueOf(n);
        n=n*n;
        String temp=Integer.toString(n); //"25"
      //  System.out.print(temp);
        if(temp.contains(tem))
            System.out.print("Automorpic Number");
        else
            System.out.print("Not");
    }
}
