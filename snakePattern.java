import java.util.Arrays;

public class snakePattern {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{6,5,4},{7,8,9},{12,11,10}};
        int[] res=snakePat(arr);
       System.out.print(Arrays.toString(res)+" ");

    }
    public static int[] snakePat(int arr[][]){
      int n=arr[0].length;//n=3
      int m= arr.length;//m=4
      int ans[]=new int[m*n];//12
      int k=0;
      for(int i=0;i<m;i++) {
          if (i % 2 == 0) {
              for (int j = 0; j < n; j++) {
                  ans[k] = arr[i][j];
                  k++;
              }
          } else {
              for (int j = n-1; j >= 0; j--) {
                  //System.out.print(arr[i][j]+" ");
                  ans[k] = arr[i][j];
                  k++;
              }
          }
      }
      return ans;
    }
}
