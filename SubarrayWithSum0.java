//Given an array of integers, arr[]. Find if there is a subarray (of size at least one) with 0 sum.
//            Return true/false depending upon whether there is a subarray present with 0-sum or not.
//        Examples:
//    Input: arr[] = [4, 2, -3, 1, 6]
//    Output: true
//    Explanation: 2, -3, 1 is the subarray with a sum of 0.
//    Input: arr = [4, 2, 0, 1, 6]
//    Output: true
//    Explanation: 0 is one of the element in the array so there exist a subarray with sum 0.
//    Input: arr = [1, 2, -1]
//    Output: false


   import java.util.*;
public class SubarrayWithSum0 {
    public static void main(String[] args) {
        int arr[] = {1,2,-1,0};
        System.out.println(subarray(arr));
    }
    // bruteForce method
//    public  static boolean subarray(int[] arr){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                sum+=arr[j];
//                if(sum==0 || arr[j]==0)
//                    return true;
//            }
//        }
//        return false;
//    }
    // optimal solution use HashMaps
    public  static boolean subarray(int[] arr){
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int num:arr){
            sum+=num;
            if(sum==0||num==0||set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }
}
