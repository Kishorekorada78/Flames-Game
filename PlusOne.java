
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};  //output : 1,2,4
        int[] result=onePlus(arr);
        for(int num:result)
            System.out.print(num+" ");
    }
    public static int[] onePlus(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] ar=new int[n+1];
        ar[0]=1;
        return ar;
    }
}
