import java.util.Scanner;
public class SecondLargestArray {
    public static void main(String[] args){
        Scanner kk = new Scanner(System.in);
        int n=kk.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kk.nextInt();
        }
        int result = getvalue(arr);
        if (result ==1)
            System.out.print("paindrome");
        else
            System.out.println("Not a palindrome");
    }
        public static int getvalue(int[] arr) {
            int n = arr.length;
            if(n<2)
                return -1;
            for(int i=0;i<n;i++){
                if(arr[i]!=arr[n-1-i])
                    return -1;
            }
            return 1;
        }
}
