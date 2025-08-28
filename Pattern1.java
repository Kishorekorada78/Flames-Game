public class Pattern1 {
    public static void main(String[] args) {
    int[][] arr=new int[6][6];
    int k=6;
    for(int i=0;i<6;i++){
        for(int j=0;j<=i;j++){
            if(i==j)
                arr[i][j]=1;
            else
                arr[i][j]=k+arr[i-1][j];
        }
        k--;
        System.out.println();
    }
  for(int i=0;i<6;i++){
      for(int j=0;j<=i;j++)
          System.out.print(arr[i][j]+" ");
      System.out.println();
      }
    }
}
