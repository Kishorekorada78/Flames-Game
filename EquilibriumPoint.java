//Given an array of integers arr[], the task is to find the first equilibrium point in the array.
//The equilibrium point in an array is an index (0-based indexing)
// such that the sum of all elements before that index is the same as the sum of elements after it.
// Return -1 if no such point exists.

// Examples:
// Input: arr[] = [1, 2, 0, 3]
// Output: 2
// Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
// Input: arr[] = [1, 1, 1, 1]
// Output: -1
// Explanation: There is no equilibrium index in the array.
import java.util.*;
public class EquilibriumPoint {
    public static void main(String[] args) {
       int[] arr={1,2,0,3};
       System.out.println(equilib(arr));
    }
    static int equilib(int[] arr){
        int n=arr.length;
        int ts=0;
        for(int num:arr)
            ts+=num;
        int leftsum=0;
        for(int i=0;i<n;i++){
            if(leftsum==(ts-leftsum-arr[i]))
                return i;
            leftsum+=arr[i];
        }
        return -1;
    }
}
