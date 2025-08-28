// Even or Odd
//import javax.swing.*;
import java.util.*;
public class Top1 {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
//        String str = kk.next();
//        boolean b = isPalindrome(str);
//        System.out.println(b);
//    }
//       int n=kk.nextInt();
//       if(n%2==0)
//           System.out.println("Even");
//       else
//           System.out.println("Odd");
//        String str=" kishore is a bad     gay   ";
//        String mm=str.trim().replaceAll("\\s+"," ");
//
//        int n=kk.nextInt();
//        int k=n*n;
//        int original=k,sum=0;
//        while(k!=0)
//        {
//            sum=sum+k%10;
//            k/=10;
//        }
//        if(sum==n)
//            System.out.println("Neon number");
//        else
//            System.out.println("Not a neon number");
        //  int n = kk.nextInt();
        //  perfect numbers
//        int count = 0;
//        for (int j = 1; j < 1000; j++){
//            int sum=0;
//            for (int i = 1; i < j; i++) {
//                if (j%i == 0) {
//                    sum += i;
//                }
//            }
//        if (j == sum)
//            count++;
//    }
//    System.out.println(count);
//        int a=12285,b=14595;
//        int sum=0;
//        for(int i=1;i<a/2;i++){
//            if(a%i==0)
//            {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//        if(sum==b)
//            System.out.println("amicable number");
        //{ Driver Code Starts

//        int[] arr = {1, 2, 3, 5};
//        System.out.println(missingNumber(arr));
//    }
//
//   public static int missingNumber(int arr[]) {
//        // code here
//        int max = arr[0];
//        int min = arr[0];
//        int total = 0, sum = arr[0], smin = 0, smax = 0, temp;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max)    //2>8
//                max = arr[i];
//            if (arr[i] < min)    // 2<8
//                min = arr[i];
//            sum += arr[i];
//        }
//        System.out.println(sum);
//        if (min > 1) {
//            for (int i = 1; i < min; i++)
//                smin += i;
//            for (int j = 1; j <= max; j++)
//                smax += j;
//            temp = smax - smin;
//            return temp - sum;
//
//        } else {
//            total = max * (max + 1) / 2;  //5*6/2 =15
//            return total - sum;     //15-11
//        }
//          int[] arr={10,7,6,8,9};
//          int temp,n=arr.length,count=0,cycle=0,temp1=count;
//          for(int i=0;i<n;i++){
//              for(int j=0;j<n-1;j++)
//              {
//                  if(arr[j]>arr[j+1]){
//                      temp=arr[j];
//                      arr[j]=arr[j+1];
//                      arr[j+1]=temp;
//                      count++;
//                  }
//                 //temp1=count;
//              }
//              if(count>temp1) {
//                  cycle++;
//                  temp1 = count;
//              }
//          }
//        System.out.println(count);
//        System.out.println(cycle);
//          for(int i=0;i<n;i++)
//              System.out.print(arr[i]+" ");
//        //{ Driver Code Starts
//import java.io.*;
//
//        class GFG {
//            public static void main(String args[]) throws IOException {
//                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//                int t = Integer.parseInt(read.readLine());
//                while (t-- > 0) {
//                    String s = read.readLine(); // Use lowercase 's'
//
//                    Solution ob = new Solution();
//                    if (ob.isPalindrome(s)) // Check palindrome
//                        System.out.println("true");
//                    else
//                        System.out.println("false");
//                    System.out.println("~");
//                }
//            }
//        }

// } Driver Code Ends


// User function Template for Java


//          public static  boolean isPalindrome(String s) {
//                // code here
//                int n=s.length();
//                if(n<2)
//                    return true;
//                String str="";
//                for(int i=n-1;i>=0;i--)
//                    str+=s.charAt(i);
//                if(str.equals(s))
//                    return true;
//                else
//                    return false;
//     }

    }
}


